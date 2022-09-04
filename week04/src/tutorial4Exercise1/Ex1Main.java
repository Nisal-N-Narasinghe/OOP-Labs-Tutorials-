package tutorial4Exercise1;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object of book class
		Book objBook = new Book();
		//create object of student class
		Student objStudent = new Student();
		
		//Create variable for IDisplay
		IDisplay variableDisplay;
		
		//Create variable for IInput
		IInput variableInput;
		
		objBook.input();
		
		objStudent.input();
		
		objBook.print();
		objBook.printDetails();
		
		objStudent.print();
		objStudent.printDetails();
		
		
		
	}

}
