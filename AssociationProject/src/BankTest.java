//import BankAccount.BankPermission;

//RUNNING ENVIRONMENT
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount.BankPermission bankPerm = new BankAccount.BankPermission();
		//BankPermission bankPerm = new BankPermission();

		//bankPerm.setDeposit(true);
		//bankPerm.setWithdraw(true);
		//bankPerm.setTransfer(true);
		
		BankAccount.setRateOfInterest(3.5f);
		
		BankAccount baObj1; //just a refToAnObject
		baObj1 = new BankAccount();//ctor
		//		  |		 |
		//		  |    constructor of the class
		//	  Allocator in Java
//The field BankAccount.accountNumber is not visible
		//baObj1.accountNumber=101;
		
		baObj1.setBankAccount(7839, "King", 5000,false);
		baObj1.printBankAccount();
		
		BankAccount baObj2; //just a refToAnObject
		baObj2 = new BankAccount();//ctor
		
		baObj2.setBankAccount(1234, "Queen", 8000,true);
		baObj2.printBankAccount();
		
		System.out.println("New rate is set....");
		BankAccount.setRateOfInterest(4.5f);
		
		baObj1.printBankAccount();
		baObj2.printBankAccount();
		
		baObj1.withdraw(500);
		baObj2.withdraw(500);
		baObj1.printBankAccount();
		baObj2.printBankAccount();
		
		
			}
 
}

