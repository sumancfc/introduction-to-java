/*(Count positive and negative numbers and compute the average of numbers) Write
        a program that reads an unspecified number of integers, determines how many
        positive and negative values have been read, and computes the total and average of
        the input values (not counting zeros). Your program ends with the input 0. Display
        the average as a floating-point number.*/

package Loops;

import java.util.Scanner;

public class CountPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int count = 0;
        int total = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        while(true) {
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positiveCount++;
            }else {
                negativeCount++;
            }
            total += number;
            count++;

        }

        if (count == 0) {
            System.out.println("No numbers are entered except 0.");
        }else {
            double average = (double) total / count;
            System.out.println("The number of positives is " + positiveCount);
            System.out.println("The number of negatives is " + negativeCount);
            System.out.printf("The total is %.1f\n", (double) total);
            System.out.printf("The average is %.2f\n", average);
        }

    }
}
