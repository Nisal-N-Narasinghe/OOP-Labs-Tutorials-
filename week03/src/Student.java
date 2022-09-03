
public class Student extends Person {
	private int sid;
	private double fee;
	
	//default constructor
	 public Student() {
		 super();
		 System.out.println("Student default");
	 }
	 
	 //Overloaded constructor
	 public Student(String NIC,String name,int sid,double fee) {
		 this(); //call to this class default constructor
		 //super(); //call to the super class default constructor
		 //super(NIC,name); //call to the super class overloaded constructor
		 System.out.println("Student overloaded 4 parameters"); 
	 }
	//Overloaded constructor
		 public Student(String NIC,String name,int sid) {
			 //super(); //call to the super class default constructor
			 super(NIC,name); //call to the super class overloaded constructor
			 System.out.println("Student overloaded with 3 parameters"); 
		 }
	 
	 
}
