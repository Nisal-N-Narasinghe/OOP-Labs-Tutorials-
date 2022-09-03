//main method
public class MyMain {
    public static void main(String[] args) {

        // create 5x5 2D array
        int[][] randNumbers = new int[5][5];

        // create object
        RandNum randObj = new RandNum(randNumbers);

        // call displayArray method
        randObj.displayArray();

    }
}
