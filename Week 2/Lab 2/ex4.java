//import java.util.*;  // all the java classes include in util package(like Scanner) 
//import java.io.*;  // all the java classes include in io package(like InputstreamReader)

//import java.io.InputStreamReader;
//import java.io.BufferedReader;

import java.io.*;

public class ex4 {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // we can write above two lines in one line like this
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input hight of the cube: ");
        double height = Double.parseDouble(br.readLine());

        System.out.print("Input hight of the cube: ");
        double width = Double.parseDouble(br.readLine());

        System.out.print("Input hight of the cube: ");
        double length = Double.parseDouble(br.readLine());

        double volume = height * width * length;

        System.out.println("Volume of the cube is :" + volume);
    }
}
