package tutorial4Exercise2;

//Implement a new class called SavingAccount which inherits the FixedDepositAccount class
public class SavingsAccount extends FixedDepositAccount {
	
	// Implement a withdraw() method that allows you to withdraw money from the SavingsAccount.
	void withdrawal(double amount) {
		balance = balance - amount;
	}

	// Implement the calculateInterest() method assuming that the Balance has been held for the one Month. 
	double calculateInterest() {
		Interest = balance*interestRate/100/12;
		return Interest;
	}
}
