
public class SavingsAccount {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	void withdraw(double amt) {
		System.out.println("Withdrawing amt "+amt);
		accountBalance-=amt;
		//accountBalance=accountBalance-0.25;
	}
	void deposit(double amt) {
		System.out.println("Depositing amt "+amt);
		accountBalance+=amt;
	}
	
}










