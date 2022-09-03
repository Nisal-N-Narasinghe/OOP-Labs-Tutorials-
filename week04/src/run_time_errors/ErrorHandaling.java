package run_time_errors;

public class ErrorHandaling {
	
	
		public static void main(String[] args) {
			
			System.out.println("Hello 1");
			
			int a=10;
			int b = 5;
			int c =5;
			int x =0;
			
			
			System.out.println("Hello 2");
			
			try {
				x = a/(b-c); //Devision by zero
			}catch ( ArithmeticException calc) {
				System.out.println("Can not devided by zero");
				//System.out.println(calc);
			}
			
			System.out.println("Hello 3");
			
			try {
				x = a/(b-c); //Devision by zero
			}catch (NumberFormatException calc2) {
				System.out.println("Can not devided by zero");
				//System.out.println(calc);
			}
			
			System.out.println("Hello 4");
			
			System.out.println("x="+x); int y = a/(b+c);
			System.out.println("y="+y);
		
	}
}
