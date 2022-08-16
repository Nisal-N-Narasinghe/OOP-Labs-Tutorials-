
//import java.utiil
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        String name;
        int age;
        float salary;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = myScanner.next();
        System.out.println("Enter your age:");
        age = myScanner.nextInt();
        System.out.println("Enter your salry :");
        salary = myScanner.nextFloat();

        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("age : " + age);
    }
}