package run_time_errors.exercise5;

public class MyMain {

public static void main(String[] args) {
		try {
		MathOp math = new MathOp();
		math.add(2, 0);
		math.divide(2, 0);
	} catch(ArithmeticException e) {
		System.out.println("Error...");
	}
		}


}
