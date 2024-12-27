package TwoDimensionalArray;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] myArray = getArray();

        // Display sum of elements
        System.out.println("\n Sum of all elements is " + sum(myArray));
    }

    public static int[][] getArray() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Enter array values
        int[][] myArray = new int[3][4];
        System.out.println("Enter " + myArray.length + " rows and " + myArray[0].length + " columns: ");

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = input.nextInt();
            }
        }
        return myArray;
    }

    public static int sum(int[][] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sum += myArray[i][j];
            }
        }
        return sum;
    }
}
