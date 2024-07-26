import java.time.LocalDateTime;

//BUSINESS ENTITY 

public class BankAccount {
	 private int accountNumber;
	 private String accountHolderName;
	 private double accountBalance;
	 private LocalDateTime accountOpeningDate;
	 
	 private static float rateOfInterest;
	 
	 static void setRateOfInterest(float rateOfInterest) {
		 System.out.println("Setting the rate");
		 BankAccount.rateOfInterest = rateOfInterest;
	 }
	//default - in the same package
	void setBankAccount(int accountNumber, String b, double c) {
		this.accountNumber =accountNumber ;
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
		System.out.println("Acc ROI     : "+BankAccount.rateOfInterest);				
		
	}
	
}
 