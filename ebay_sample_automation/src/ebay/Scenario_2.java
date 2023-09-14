package ebay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Scenario_2 {

	public static void main(String[] args) throws InterruptedException {

//		have a check before uploading that the broswer driver location is my location.
		System.setProperty("Webdriver.chrome.driver", "../driver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//	    typing search string in the search bar
		driver.findElement(By.cssSelector("input[aria-label='Search for anything']")).sendKeys("Macbook");

//	    Selecting search category
		Select categoryList = new Select(
				driver.findElement(By.cssSelector("select[aria-label='Select a category for search']")));
		categoryList.selectByVisibleText("Computers/Tablets & Networking");

//	    Click on search
		driver.findElement(By.cssSelector("input[value='Search']")).click();

//	    checking whether page is loaded completely using javascript executor...
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("return document.readyState").toString().equals("complete");

		String firstResult = driver
				.findElement(By.xpath("//ul[@class='srp-results srp-list clearfix']/li[2]/div/div[2]/a/div/span"))
				.getText();
		if (firstResult.toLowerCase().contains("macbook")) {
			System.out.println("The search string matches");
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(true);
		}

		driver.close();

	}

}
