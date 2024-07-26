import java.time.LocalDateTime;

//BUSINESS ENTITY 

//1. enclosed class 'BankPermission'
//   if static, then outside world need to 
//   refer the enclosing ' BankAccount' class name to refer it

//2. enclosed class 'BankPermission'
// if not static, then make an object of it
//and then access it

//3. enclosed class 'BankPermission' 
// 


//public, abstract or final
public abstract class BankAccount {
	 private int accountNumber;
	 private String accountHolderName;
	 private double accountBalance;
	 private LocalDateTime accountOpeningDate;
	 
	 private static float rateOfInterest;
	 
	 //hasA 
	 private BankPermission bankPerm = new BankPermission();

	//inner design solely used by the enclosing class
	
	static class BankPermission //inner class
	{
		boolean withdraw;
		boolean deposit;
		boolean transfer;
		
		public boolean canWithdraw() {
			return withdraw;
		}
		public void setWithdraw(boolean withdraw) {
			this.withdraw = withdraw;
		}
		public boolean canDeposit() {
			return deposit;
		}
		public void setDeposit(boolean deposit) {
			this.deposit = deposit;
		}
		public boolean canTransfer() {
			return transfer;
		}
		public void setTransfer(boolean transfer) {
			this.transfer = transfer;
		}
		
		
		
	}
		
	 
	 static void setRateOfInterest(float rateOfInterest) {
		 System.out.println("Setting the rate");
		 BankAccount.rateOfInterest = rateOfInterest;
	 }
	 
	 void withdraw(float amt) {
		 System.out.println("\nWithdrawing...."+amt);
		 if(bankPerm.canWithdraw()) {
			 accountBalance-=amt;
		 }
		 else {
			 System.out.println("Withdraw NOT permitted....");
		 }
		 
	 }
	//default - in the same package
	void setBankAccount(int accountNumber, String b, double c, boolean withdrawlPermission) {
		this.accountNumber =accountNumber ;
		accountHolderName=b;
		accountBalance=c;
		accountOpeningDate = LocalDateTime.now(); //static function
		bankPerm.setWithdraw(withdrawlPermission);
	}
	void printBankAccount() {
		//sysout -> ctrl spacebar
		System.out.println("Bank Acc No : "+accountNumber);
		System.out.println("Acc Holder  : "+accountHolderName);
		System.out.println("Acc Balance : "+accountBalance);				
		System.out.println("Acc Date    : "+accountOpeningDate);				
		System.out.println("Acc ROI     : "+BankAccount.rateOfInterest);				
		System.out.println("----------------");
	}
	
}
 