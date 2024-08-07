import java.time.LocalDateTime;

public class BankAccount1 {

	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private LocalDateTime accountOpeningDate;
	
	public void setBankAccount1(int accountNumber, String accountHolderName, double accountBalance,
			LocalDateTime accountOpeningDate) {
		//super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountOpeningDate = accountOpeningDate;
	}

	@Override
	public String toString() {
		return "\nBankAccount1\n[accountNumber=" + accountNumber + ",\naccountHolderName=" + accountHolderName
				+ "\naccountBalance=" + accountBalance + "\naccountOpeningDate=" + accountOpeningDate + "]\n";
	}

	
	
	 
}