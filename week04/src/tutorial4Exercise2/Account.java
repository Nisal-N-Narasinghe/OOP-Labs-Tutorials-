package tutorial4Exercise2;

//Implement an abstract class called Account. Have the following properties accountNo, name, balance.


public abstract class Account {
	private String accountNumber;
	private String name;
	protected double balance;
	
	public Account() {
		
	}
	
	//Implement a constructor to get values to the Account class
	public Account(String accountNumber, String name, double balance) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	//Implement a Deposit() method to deposit money. The amount deposited should update the balance.
	void deposite(double amount) {
		this.balance = balance + amount;
	}
	
	//Have an abstract method called calculateInterest() which returns a double value.
	abstract double calculateInterest();
	
	//Implement a method to display() the account details.
	void display() {
		 System.out.println("Account No :- " + accountNumber);
		 System.out.println("Name:- " + name);
		 System.out.println("Balance:- " + balance);
	}
}

