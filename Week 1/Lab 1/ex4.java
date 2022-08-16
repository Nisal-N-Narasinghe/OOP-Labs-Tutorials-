public class ex4 {

    public static void main(String[] args) {
        int dayValue = 2;

        switch (dayValue) {
            case 1:
                System.out.println("Value of the day : 1\nDay of the week : Sunday\nGoodbye!");
                break;
            case 2:
                System.out.println("Value of the day : 2\nDay of the week : Monday\nGoodbye!");
                break;
            case 3:
                System.out.println("Value of the day : 3\nDay of the week : Tuesday\nGoodbye!");
                break;
            case 4:
                System.out.println("Value of the day : 4\nDay of the week : Wednesday\nGoodbye!");
                break;
            case 5:
                System.out.println("Value of the day : 5\nDay of the week : Thursday\nGoodbye!");
                break;
            case 6:
                System.out.println("Value of the day : 6\nDay of the week : Friday\nGoodbye!");
                break;
            case 7:
                System.out.println("Value of the day : 7\nDay of the week : Saturday\nGoodbye!");
                break;
            default:
                System.out.println("Invalid day value\nGoodbye!");

        }
    }
}
