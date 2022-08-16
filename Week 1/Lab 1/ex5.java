public class ex5 {
    public static void main(String[] args) {
        int i = 1, j = 1, k = 1;

        System.out.println("Using While Loop");
        while (i <= 5) {
            System.out.println("* * * * *");
            i++;

        }
        System.out.println("Using For Loop");
        for (i = 1; i <= 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {

                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("Same Line ");
        for (i = 1; i <= 5; i++) {

            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {

                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
