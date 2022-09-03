package run_time_errors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {
	public static void main(String[] args)throws IOException {
		
		//String name = "23323Nisal";
		
		int num = Integer.parseInt("Nisal");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		System.out.println(num);
	}
}