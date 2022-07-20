package Q3;

public class Account {
	
	String accountNumber;
	
	double balance;
	
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void deposit(int amount) {
		double total = this.balance-amount;
		this.balance = total;
	}
	
	double withdraw(int amount) throws InsufficientFundsException {
		if(amount < balance) {
			double remained = balance-amount;
			
			return remained;
		}
		
		InsufficientFundsException ie = new InsufficientFundsException("Insufficient Fund....");
		throw ie;
	}

}
