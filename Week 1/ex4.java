
import java.util.Scanner;

public class ex4 {

    public static void main(String args[]) {
        int[] num = new int[10]; // ceate a array length 10
        int odd = 0;
        int even = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= num.length; i++) {

            System.out.print("Enter Number " + i + ": ");
            num[i - 1] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 1) {
                odd += 1;
            } else {
                even += 1;
            }

        }

        System.out.println("odd count : " + odd);
        System.out.println("even count : " + even);
    }

}
