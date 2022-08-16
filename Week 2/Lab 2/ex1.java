
public class ex1 {
    public static void main(String[] args) {
        int miles = 26;
        int yards = 385;
        double kilometers;

        kilometers = (miles * 1.609) + (yards * (1.609 / 1760.0));
        System.out.println("Kilometers: " + kilometers);
    }
}
