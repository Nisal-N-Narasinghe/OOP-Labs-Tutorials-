
public class Receptionist {
	
	
	private int id;
	private String name;
	private double salary;
	
	//default Constructor
	public Receptionist() {
		//this can be keep empty
		id = 0;
		name = null;
		salary = 0.0;	
	}
	
	//overloaded-Constructor with 3 parameters
	//in java overload constructor parameter names are similar to variable names.
	//we use this.variablename = parametername to assign values to variables
	public Receptionist(int id, String name, double salary) {
		//assign values from the main method 
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//overloaded-Constructor with 2 parameters
	public Receptionist(int id, String name) {
		//assign values from the main method 
		this.id = id;
		this.name = name;
		
	}
	
	//Getters(accessor)
	//Getter for id 
	public int getId() {
		return this.id;
	}
	//Getter for name
	public String getName() {
		return this.name;
	}
	//Getter for salary
	public double getSalary() {
		return this.salary;
	}
	
	//Setters(mutator)
	//Setter for id
	public void setId(int id) {
		this.id = id;
	}
	//Setter for name 
	public void setName(String name) {
		this.name = name; 
	}
	//Setter for salary 
	public void setSalary(double salary) {
		this.salary = salary; 
	}
	
		

	public boolean checkRoomAvaialbility(int roomNo){
		return true;
	}
	public double generateBill() {
		return 0.0;
	}
	public void takeCustomerFeedback() {
		
	}

}

