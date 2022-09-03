package run_time_errors;

public class Exercise1 {
	public static void main(String[] args) {
		
		String name = "23323Nisal";
		
		int num = Integer.parseInt(name);
		
		System.out.println(num);
	}
}

//error message

/*Exception in thread "main" java.lang.NumberFormatException: For input string: "23323Nisal"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:784)
	at run_time_errors.Exercise1.main(Exercise1.java:8)*/
