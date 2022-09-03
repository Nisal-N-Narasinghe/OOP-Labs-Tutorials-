package run_time_errors;

class Error02 {
	public static void main(String[] args) {
		
		int a=10;
		int b = 5;
		int c =5;
		
		System.out.println("\nHello");
		
		int x = a/(b-c); //Devision by zero
		
		
		System.out.println("x="+x); int y = a/(b+c);
		System.out.println("y="+y);
	}
}

//This code gives below error

/* Exception in thread "main" java.lang.ArithmeticException: / by zero
at run_time_errors.Error02.main(Error02.java:8) */