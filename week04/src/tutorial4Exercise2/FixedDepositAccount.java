package tutorial4Exercise2;

//Implement a new class called FixedDepositAccount which extends the Account class
public class FixedDepositAccount extends Account {

	//property called interestRate and Interest
	protected double interestRate,Interest;
	
	// getter for the interestRate
	public double getinterestRate(){
		return Interest;
	}
	
	// setter for the interestRate
	public void setinterestRate(double Interest){
		this.Interest = Interest;
	}
	
	//Implement the calculateInterest() method assuming that the Balance has been held for the entire year.
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		Interest = balance*interestRate/100;
		return Interest;
	}

}
