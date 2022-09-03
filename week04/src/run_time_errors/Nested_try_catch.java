package run_time_errors;

public class Nested_try_catch {
	public static void main(String[] args) {
		try { //try-block2
			
			try { //try-block3
				
				try {
					int arr[]= {1,2,3,4};
					System.out.println(arr[10]);
				} catch (ArithmeticException e) {
					System.out.println("Arithmatic Exception");
					System.out.println(" Handeled in try-block3");
				}
				
			}catch(ArithmeticException e) {
				System.out.println("Arithmatic Exception");
				System.out.println(" Handeled in try-block2");
			}
			
		}catch (ArithmeticException e3) {
			System.out.println("Arithmatic Exception");
			System.out.println(" Handeled in main try-block");
			
		}catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(" Handeled in main try-block");
			
		}catch (Exception e5) {
			System.out.println("Exception");
			System.out.println(" Handeled in main try-block");
		}
		
	}
}
