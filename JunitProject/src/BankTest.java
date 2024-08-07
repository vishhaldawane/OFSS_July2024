import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

public class BankTest {

	SavingsAccount sav ;
	
	@BeforeEach
	void init() {
		System.out.println("BankTest:init()....");
		sav = new SavingsAccount();		
	}
	
	@AfterEach
	void over() {
		System.out.println("BankTest:over()....");
		sav = null;
	}

	
	@Ignore
	@Test
	public void testCase3() {
		System.out.println("testCase3: WITHDRAW...");
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
	public void testCase1() {
		System.out.println("testCase1: DEPSOIT...");

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
	
	@Test // TDD
	public void testCase2() {
		System.out.println("testCase2: ARRAY...");

		SavingsAccount savAry[]=
				{
				new SavingsAccount(101,"Jack",50000),
				new SavingsAccount(102,"Jane",60000),
				new SavingsAccount(103,"Julie",70000)
		};
		System.out.println("Checking array...");
		Assertions.assertTrue(savAry!=null);
		System.out.println("Printing first value...");
		Assertions.assertTrue(savAry.length > 0 );
		for (SavingsAccount savingsAccount : savAry) {
			System.out.println("sav "+savingsAccount);
		}
	}
	
}









