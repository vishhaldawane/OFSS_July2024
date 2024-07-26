import java.time.LocalDateTime;

//BUSINESS ENTITY 

public class BankAccount {
	 private int accountNumber;
	 private String accountHolderName;
	 private double accountBalance;
	 private LocalDateTime accountOpeningDate;
	
	//default - in the same package
	void setBankAccount(int a, String b, double c) {
		accountNumber =a ;
		accountHolderName=b;
		accountBalance=c;
		accountOpeningDate = LocalDateTime.now(); //static function
	}
	void printBankAccount() {
		//sysout -> ctrl spacebar
		System.out.println("Bank Acc No : "+accountNumber);
		System.out.println("Acc Holder  : "+accountHolderName);
		System.out.println("Acc Balance : "+accountBalance);				
		System.out.println("Acc Date    : "+accountOpeningDate);				
	}
	
}
 