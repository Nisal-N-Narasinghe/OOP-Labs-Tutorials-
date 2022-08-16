import java.util.Scanner;

public class ex2 {
    public static void main(String args[]) {
        int length;
        int width;
        int perimeter;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lengt of the rectangle: ");
        length = sc.nextInt();
        System.out.print("Enter width of the rectangle: ");
        width = sc.nextInt();

        perimeter = length * 2 + width * 2;

        System.out.print("Perimeter of the rectangle: " + perimeter);

    }

}
