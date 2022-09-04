package tutorial4Exercise2;

//Create objects from the FixedDeposit and SavingAccount. Call the Deposit() and withdraw() methods (Only SavingsAccount have withdrawals
public class Ex2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account objAccount = new FixedDepositAccount();
		SavingsAccount objSavingsAccount = new SavingsAccount();
		
		objAccount.deposite(230000.0);
		
		objSavingsAccount.deposite(100000.0);
		objSavingsAccount.withdrawal(100.0);
		
		objAccount.display();
	}

}
