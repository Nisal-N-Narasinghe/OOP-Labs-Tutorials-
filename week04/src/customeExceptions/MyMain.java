package customeExceptions;

import java.util.*;

public class MyMain {
	public static void main (String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			String id;
			
			System.out.print("Enter your Student ID:- ");
			id = sc.next();
			if (!id.startsWith("IT")) {
				throw new InvalidStudentIDException("java.lang.Invalid Student id:");
			}else {
				System.out.println("Correct Student Id");
			}
		}catch(InvalidStudentIDException e) {
			System.out.println(e);
		}
	}

}
