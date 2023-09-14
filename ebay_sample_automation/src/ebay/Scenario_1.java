package ebay;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario_1 {

	public static void main(String[] args) throws InterruptedException {

//		have a check before uploading that the broswer driver location is my location.
		System.setProperty("Webdriver.chrome.driver", "../driver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.id("gh-shop-a")).click();
		driver.findElement(By.xpath("//table[@id='gh-sbc']/tbody/tr/td[1]/ul[2]/li[4]/a")).click();
		driver.findElement(By.xpath("//div[@class='dialog__cell']/section/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//section[contains(@class,'b-module b-carousel b-guidance b')]/div/div[2]/button"))
				.click();

//	    screen-size selection
		WebElement screenSize = driver.findElement(By.xpath("//div[contains(@id,'mainPanel-Screen%20Size')]/span"));
		screenSize.click();
		String screenSizeFilter = screenSize.getText();
		driver.findElement(By.xpath("//div[contains(@id,'Screen%20Size_4.0%20-%204.4%20in')]/span/span/input")).click();

//	    Price selection
		WebElement price = driver.findElement(By.xpath("//div[contains(@id,'-mainPanel-price')]/span"));
		price.click();
		String priceFilter = price.getText();
		driver.findElement(By.xpath("//input[@aria-label='Minimum Value, US Dollar']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@aria-label='Maximum Value, US Dollar']")).sendKeys("2000");

//	    Item location selection
		WebElement itemLocation = driver.findElement(By.xpath("//div[contains(@id,'-mainPanel-location')]/span"));
		itemLocation.click();
		String locationFilter = itemLocation.getText();
		driver.findElement(By.cssSelector("input[value='US Only']")).click();

//	    Apply filter
		driver.findElement(By.cssSelector("button[aria-label='Apply']")).click();

//	    Verifying tags are applied.
		driver.findElement(By.xpath("//li[@class='brm__item brm__item--applied']/div/button")).click();
		List<WebElement> filter_list = driver.findElements(By.xpath("//ul[@class='brm__list']/li[1]/div/div/ul"));

		for (WebElement filters : filter_list) {
			if (filters.getText().contains(screenSizeFilter) || filters.getText().contains(priceFilter)
					|| filters.getText().contains(locationFilter)) {
				continue;
			} else {
				Assert.assertTrue(false);
			}
		}
		System.out.println("The selected filter tags are applied correctly.");

		driver.close();

	}

}
