package Loops;

import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        if(lines < 1 || lines > 15) {
            System.out.println("Please enter a number between 1 and 15");
            return;
        }

        for (int i = 1; i <= lines; i++) {
            // Print Space for centering pyramid
            for (int j = 1; j <= lines - i; j++) {
                System.out.print("  ");
            }

            // Print descending number
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print ascending number
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Go to next line
            System.out.println();
        }

    }
}
