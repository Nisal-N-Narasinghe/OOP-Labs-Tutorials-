package interface_exercise1;

public class Employee implements Printable{
	
private int id;
private String name;
private String address;

	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void print(){
		System.out.println("Employee id:- "+id);
		System.out.println("Employee name:- "+name);
		System.out.println("Employee address:- "+address+"\n");

	}

	
}
