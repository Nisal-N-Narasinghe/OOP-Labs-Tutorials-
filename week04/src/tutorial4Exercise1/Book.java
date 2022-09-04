package tutorial4Exercise1;

import java.util.*;

public class Book implements IDisplay,IInput {
	String bookID;
	String bookTitle;
	String bookPublisher;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner objScanner = new Scanner(System.in);
		
		System.out.print("Enter the book id:- ");
		this.bookID = objScanner.next();
		
		System.out.print("Enter the book title:- ");
		this.bookTitle = objScanner.next();
		
		System.out.print("Enter the book publisher:- ");
		this.bookPublisher = objScanner.next();
		
		//objScanner.close();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("\n\nBook ID:- "+this.bookID+" Book title:- "+this.bookTitle+" Book publisher:- "+this.bookPublisher);
		
	}
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Book ID:- "+this.bookID+"\nBook title:- "+this.bookTitle+"\nBook publisher:- "+this.bookPublisher);
	}

	

}
