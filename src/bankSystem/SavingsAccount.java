package bankSystem;

public class SavingsAccount extends Account {
	
	public SavingsAccount(Client client) {
		super(client);
	}

	public void printStatement() {
		super.printBankStatement();
	}
}
