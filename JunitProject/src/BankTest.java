import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTest {

	
	@Test
	public void withdrawTest() {
		SavingsAccount sav = new SavingsAccount();		
	Assertions.assertTrue(sav!=null);
		sav.setAccountNumber(1);
		sav.setAccountHolder("Jack");
		sav.setAccountBalance(50000);
		System.out.println("before : sav "+sav);

		sav.withdraw(4000);
	Assertions.assertEquals(46000, sav.getAccountBalance());
		System.out.println("after : sav "+sav);
	}
	
	@Test // TDD
	public void depositTest() {
		SavingsAccount sav = new SavingsAccount();		
		Assertions.assertTrue(sav!=null);
			double openingBalance=50000;
			double amountToDeposit=4000;
			sav.setAccountNumber(1);
			sav.setAccountHolder("Jack");
			sav.setAccountBalance(openingBalance);
			System.out.println("before : sav "+sav);

			sav.deposit(amountToDeposit);
		Assertions.assertEquals(openingBalance+amountToDeposit, sav.getAccountBalance());
			System.out.println("after : sav "+sav);
	}
	
}









