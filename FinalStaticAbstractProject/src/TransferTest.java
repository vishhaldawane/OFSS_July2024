
public class TransferTest {
	public static void main(String[] args) {
	
		CurrentAccount currAcc = new CurrentAccount(5000000);
		
		SavingsAccount savAcc1 = new SavingsAccount(30000);
		SavingsAccount savAcc2 = new SavingsAccount(20000);
		SavingsAccount savAcc3 = new SavingsAccount(60000);
		SavingsAccount savAcc4 = new SavingsAccount(20000);
		SavingsAccount savAcc5 = new SavingsAccount(80000);
		
		currAcc.showBalance();
		savAcc1.showBalance();
		savAcc2.showBalance();
		savAcc3.showBalance();
		savAcc4.showBalance();
		savAcc5.showBalance();
		
		FundsTransferService.transferFunds(currAcc, savAcc1, 50000);
		FundsTransferService.transferFunds(currAcc, savAcc2, 55000);
		FundsTransferService.transferFunds(currAcc, savAcc3, 60000);
		FundsTransferService.transferFunds(currAcc, savAcc4, 75000);
		FundsTransferService.transferFunds(currAcc, savAcc5, 80000);
		
			
		currAcc.showBalance();
		savAcc1.showBalance();
		savAcc2.showBalance();
		savAcc3.showBalance();
		savAcc4.showBalance();
		savAcc5.showBalance();
		
		
	}
}

class FundsTransferService
{
	static void transferFunds(Withdrawing x, Depositing y, double amountToTransact) {
		System.out.println("----transferring funds-----");
		x.withdraw(amountToTransact);
		y.deposit(amountToTransact);
		System.out.println("----funds transferred------");

	}
}
interface Depositing
{
	void deposit(double amt); //public abstract
}

interface Withdrawing 
{
	void withdraw(double amt);
}


class CurrentAccount implements Withdrawing, Depositing
{
	double balance;
	
	CurrentAccount(double bal) {
		balance = bal;
	}
	public void withdraw(double amt) {
		balance -=amt;
	}
	public void deposit(double amt) {
		balance +=amt;
	}
	void showBalance() {
		System.out.println("Current Account : "+balance);
	}
}

class SavingsAccount implements Depositing, Withdrawing
{
	double balance;
	
	SavingsAccount(double bal) {
		balance = bal;
	}
	public void withdraw(double amt) {
		balance -=amt;
	}
	public void deposit(double amt) {
		balance +=amt;
	}
	void showBalance() {
		System.out.println("Savings Account : "+balance);
	}
}




