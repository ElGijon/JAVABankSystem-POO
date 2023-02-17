package bankSystem;

public class Main {

	public static void main(String[] args) {
		
		Client john = new Client("John Green", 3499992);
	
		
		Account ca = new CurrentAccount(john);
		ca.deposit(150);
		
		Account sa = new SavingsAccount(john);
		ca.transfer(50, sa);
		
		ca.printBankStatement();
		sa.printBankStatement();
		
	}

}

