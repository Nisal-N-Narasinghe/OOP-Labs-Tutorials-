
public class MyMain {

	public static void main(String[] args) {
		//connect with default constructor
		Receptionist repObj1 = new Receptionist();
		//connect with overloaded constructor with 3 parameters
		Receptionist repObj2 = new Receptionist(219, "Kamal", 25000);
		
		repObj2.getId();
		repObj2.getName();
		repObj2.getSalary();
		
		repObj2.setId(123);
		repObj2.setName("Nisal");
		repObj2.setSalary(25000);
		
		
		
		
		//connect with overloaded constructor with 2 parameters
		Receptionist repObj3 = new Receptionist(119, "Namal");
		
		
		boolean result=repObj1.checkRoomAvaialbility(45);
		
		if(result == true) {
			System.out.println("Room is Available");
		}else {
			System.out.println("Room is not Available");
		}
		
		double bill = repObj1.generateBill();
		System.out.println("Total bill is "+bill);
		
		repObj1.takeCustomerFeedback();
	}

}
