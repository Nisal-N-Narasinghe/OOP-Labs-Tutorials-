import java.util.Scanner;

public class student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.println("Enter Student mark 1: ");
        double mark1 = sc.nextDouble();

        System.out.println("Enter Student mark 2: ");
        double mark2 = sc.nextDouble();

        System.out.println("Enter Student mark 3: ");
        double mark3 = sc.nextDouble();

        mark markobj = new mark(name, id, mark1, mark2, mark3);

        // markobj.setStudentDetails(name, id, mark1, mark2, mark3);

        markobj.calcAverage();

        markobj.displayDetails();

    }

}
