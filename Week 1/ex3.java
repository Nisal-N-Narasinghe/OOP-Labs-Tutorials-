
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int num[] = { 0, 0, 0 };

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= num.length; i++) {
            System.out.println("Enter number " + i);
            num[i - 1] = sc.nextInt();
        }

        if (num[0] > num[1] && num[0] > num[2]) {
            System.out.println("Number 1 is the largest number.");
        } else if (num[1] > num[0] && num[1] > num[2]) {
            System.out.println("Number 2 is the largest number.");
        } else {
            System.out.println("Number 3 is the largest number.");
        }

    }
}
