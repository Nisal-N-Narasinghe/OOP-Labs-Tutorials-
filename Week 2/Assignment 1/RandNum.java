
//import util classes for generating random numbers(import all util classes)
import java.util.*;

public class RandNum {

    int[][] randArray = new int[5][5];
    int min = randArray[0][0];
    int max = randArray[0][0];
    int sum = 0;
    float average = 0;

    // constructor
    public RandNum(int[][] randNumbers2) {
        randArray = randNumbers2;
        Random rand = new Random();

        // store 25 randome values between 1 - 100 to array
        for (int i = 0; i < randNumbers2.length; i++) {
            for (int j = 0; j < randNumbers2.length; j++) {
                randNumbers2[i][j] = rand.nextInt(100);
                randNumbers2[i][j] = randNumbers2[i][j] + 1; // to avoid getting 0 as randome number
            }

        }

    }

    // create a methode for calculating minimum value
    public int minimum() {
        min = 100;
        for (int i = 0; i < randArray.length; i++) {
            for (int j = 0; j < randArray.length; j++) {
                if (min > randArray[i][j]) {
                    min = randArray[i][j];
                }

            }

        }
        return min;
    }

    // create a methode for calculating maximum value
    public int maximum() {
        for (int i = 0; i < randArray.length; i++) {
            for (int j = 0; j < randArray.length; j++) {
                if (max < randArray[i][j]) {
                    max = randArray[i][j];
                }

            }

        }
        return max;
    }

    // create a methode for calculating average
    public float averageOfArray() {

        for (int i = 0; i < randArray.length; i++) {
            for (int j = 0; j < randArray.length; j++) {
                sum = sum + randArray[i][j];

            }

        }
        return average = sum / 25.0f;

    }

    /*
     * create a methode to display array elements,minimum value, maximum value and
     * average
     */
    public void displayArray() {
        System.out.println("\n--- 5x5 2D Array ---");
        for (int i = 0; i < randArray.length; i++) {
            for (int j = 0; j < randArray.length; j++) {

                System.out.print(randArray[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n * The Minimum value = " + minimum()); // display the minimum value
        System.out.println("\n * The Maximum value  = " + maximum()); // display the maximum value
        System.out.println("\n * The Average of the Array = " + averageOfArray() + "\n"); // display the average
    }

}
