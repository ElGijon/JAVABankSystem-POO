package bankSystem;

public abstract class Account implements InterfaceAccount {
	
	private static int SEQUENTIAL = 1;
	private static final int DEFAULT_AGENCY = 1;
	
	
	protected int agency;
	protected int accountNumber;
	protected double balance;
	protected Client client;
	
	
	public Account(Client client) {
		this.agency = DEFAULT_AGENCY;
		this.accountNumber = SEQUENTIAL++;
		this.client = client;
	}
	
		
	public void withdraw(double value) {
		/* balance = balance - value;
		this.balance = balance - value;*/
		balance -= value;
	}

	public void deposit(double value) {
		/* balance = balance + value;
		this.balance = balance + value;*/
			balance += value;
	}

	public void transfer(double value, Account destinationAccount) {
		
		this.withdraw(value);
		destinationAccount.deposit(value);
		
	}
	
	public void printBankStatement() {
		
		System.out.println("=== Printing bank statement ===");
		System.out.println(String.format("Account Holder: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Account Number: %d", this.accountNumber));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
	
	
	public int getAgency() {
		return agency;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}


}
