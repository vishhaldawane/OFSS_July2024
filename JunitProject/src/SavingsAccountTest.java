
public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount sav =new SavingsAccount();
		
		double openingBalance=50000;
		double amountToWithdraw=4000;
		
		if(sav==null) {
			System.out.println("expected <not null> but found <null>");
			System.exit(0);
		}
		else {
			System.out.println("Object passed the NOTNULL test case1");
		}
		sav.setAccountNumber(1);
		sav.setAccountHolder("Jack");
		sav.setAccountBalance(openingBalance);

		System.out.println("sav : "+sav);
		double currentBalance = sav.getAccountBalance(); //50000
		sav.withdraw(amountToWithdraw);
		double expectedBalance = currentBalance - amountToWithdraw; //50000-4000

		if(expectedBalance == sav.getAccountBalance()) {
			System.out.println("Withdraw PASSED the TEST case2");
		}
		else {
			System.out.println("Withdraw failed : <expected>:"+expectedBalance+" but <found>:"+sav.getAccountBalance());
		}
//		
//		System.out.println("sav : "+sav);
//		sav.deposit(20000);
//		System.out.println("sav : "+sav);
//		
	}
}
