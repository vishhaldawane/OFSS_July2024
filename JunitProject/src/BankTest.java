import org.junit.jupiter.api.Test;

public class BankTest {

	
	@Test
	public void withdrawTest() {
		SavingsAccount sav =new SavingsAccount();		
		sav.setAccountNumber(1);
		sav.setAccountHolder("Jack");
		sav.setAccountBalance(50000);

		
	}
}
