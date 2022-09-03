package customeExceptions;

public class InvalidStudentIDException extends Exception{
	
	public InvalidStudentIDException(String message) {
		super(message);
	}
}
