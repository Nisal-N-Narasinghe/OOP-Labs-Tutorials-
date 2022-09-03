package interface_exercise1;

public class Book implements Printable{
	
	private int id;
	private String name;
	private String author;
	
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public void print() {
		System.out.println("Book Id:- "+id);
		System.out.println("Book name:- "+name);
		System.out.println("Book Author:- "+author);

		
	}
}
