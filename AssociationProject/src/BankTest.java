//RUNNING ENVIRONMENT
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount baObj1; //just a refToAnObject
		baObj1 = new BankAccount();//ctor
		//		  |		 |
		//		  |    constructor of the class
		//	  Allocator in Java
//The field BankAccount.accountNumber is not visible
		//baObj1.accountNumber=101;
		
		baObj1.setBankAccount(7839, "King", 5000);
		baObj1.printBankAccount();
		
			}
 
}

