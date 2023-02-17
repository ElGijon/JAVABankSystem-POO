package bankSystem;

public class CurrentAccount extends Account {
	
	public CurrentAccount(Client client) {
		super(client);
	}
	
	public void printStatement() {
		super.printBankStatement();
	}
}
