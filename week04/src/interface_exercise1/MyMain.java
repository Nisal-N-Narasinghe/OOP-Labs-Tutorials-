package interface_exercise1;

public class MyMain {

	public static void main(String[] args) {
		
		Employee objEmployee = new Employee(213, "Nisal", "Bunnehepola Udubaddawa");
		Book objBook = new Book(123, "MadolDuwa","Martin Wickramasinghe");
		
		objEmployee.print();
		objBook.print();
		

	}

}
