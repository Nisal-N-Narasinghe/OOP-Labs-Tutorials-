package run_time_errors.exercise4;

public class MyMain {

	public static void main(String[] args) {
		
		MathOp math = new MathOp();
		math.add(2, 0);
		math.divide(2, 0);
	}


}
