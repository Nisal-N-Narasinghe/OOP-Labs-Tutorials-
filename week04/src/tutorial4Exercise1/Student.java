package tutorial4Exercise1;

import java.util.*;

public class Student implements IDisplay,IInput {

	String studentId;
	String studentName;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner objScanner = new Scanner(System.in);
		
		System.out.print("\nEnter Student Id:- ");
		this.studentId = objScanner.next();
		
		System.out.print("Enter Student name:- ");
		this.studentName = objScanner.next();
		
		//objScanner.close();
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("\nStudent id:- "+this.studentId+" Student name:- "+this.studentName);
		
	}
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Student id:- "+this.studentId+"\nStudent name:- "+this.studentName);
	}

	
}
