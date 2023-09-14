
public class BankAccount {

	Long accountNumber = 987657463524356l;
	Integer accountBalance = 350;
	String holderName = "Karthi";
	
	public Integer getAccountBalance() {
		System.out.println("Account balance is:"+accountBalance);
		return accountBalance;
	}
	
	public static void main(StringPractice[] args) {
		// TODO Auto-generated method stub

		BankAccount obj = new BankAccount();
		int balance = obj.getAccountBalance();
		System.out.println(balance);
	}

}
