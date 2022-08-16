//import java.util.Scanner;

public class mark {
    // declare private field for student name
    private String stName;
    private String stId;
    private double stmark1;
    private double stmark2;
    private double stmark3;
    private double average;

    public mark() {
        stmark1 = 0;
        stmark2 = 0;
        stmark3 = 0;
    }

    public mark(String studName, String studId, double studMark1, double studMark2,
            double studMark3) {
        stName = studName;
        stId = studId;
        stmark1 = studMark1;
        stmark2 = studMark2;
        stmark3 = studMark3;
    }

    /*
     * public void setStudentDetails(String studName, String studId, double
     * studMark1, double studMark2,
     * double studMark3) {
     * this.stName = studName;
     * this.stId = studId;
     * this.stmark1 = studMark1;
     * this.stmark2 = studMark2;
     * this.stmark3 = studMark3;
     * }
     */

    public void calcAverage() {
        average = (stmark1 + stmark2 + stmark3) / 3;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + stName);
        System.out.println("Student Id: " + stId);
        System.out.println("Student Average mark: " + average);
    }

    /*
     * public static void main(String[] args) {
     * // mark markobj = new mark();
     * 
     * Scanner sc = new Scanner(System.in);
     * 
     * System.out.println("Enter Student Name: ");
     * String name = sc.nextLine();
     * 
     * System.out.println("Enter Student ID: ");
     * String id = sc.nextLine();
     * 
     * System.out.println("Enter Student mark 1: ");
     * double mark1 = sc.nextDouble();
     * 
     * System.out.println("Enter Student mark 2: ");
     * double mark2 = sc.nextDouble();
     * 
     * System.out.println("Enter Student mark 3: ");
     * double mark3 = sc.nextDouble();
     * 
     * // markobj.setStudentDetails(name, id, mark1, mark2, mark3);
     * 
     * mark markobj = new mark(name, id, mark1, mark2, mark3);
     * 
     * markobj.calcAverage();
     * 
     * markobj.displayDetails();
     * 
     * }
     */
}
