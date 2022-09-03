package run_time_errors;

public class Exercise2 {
public static void main(String[] args) {
		
	int num = 0;
	try {
		String name = "23323Nisal";
		
		 num = Integer.parseInt(name);
	}catch (NumberFormatException objException) {
		
		System.out.println("Exception:- "+objException);
		System.out.println("Wrong Number Formate");
		
	}
		System.out.println(num);
	}
}
