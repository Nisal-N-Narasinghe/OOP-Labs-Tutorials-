import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input hight of the cube: ");
        double height = sc.nextDouble();

        System.out.print("Input hight of the cube: ");
        double width = sc.nextDouble();

        System.out.print("Input hight of the cube: ");
        double length = sc.nextDouble();

        double volume = height * width * length;

        System.out.println("Volume of the cube is :" + volume);

    }
}