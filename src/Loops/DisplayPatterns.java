/*(Display four patterns using loops) Use nested loops that display the following patterns in four separate programs:
Pattern A            Pattern B            Pattern C          Pattern D
1                    1 2 3 4 5 6                  1          1 2 3 4 5 6
1 2                  1 2 3 4 5                  2 1            1 2 3 4 5
1 2 3                1 2 3 4                  3 2 1              1 2 3 4
1 2 3 4              1 2 3                  4 3 2 1                1 2 3
1 2 3 4 5            1 2                  5 4 3 2 1                  1 2
1 2 3 4 5 6          1                  6 5 4 3 2 1                    1
*/

package Loops;

import java.util.Scanner;

public class DisplayPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of patterns you want to display: ");
        int number = input.nextInt();

        // Design Pattern A
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Space between patterns
        System.out.println();

        // Design Pattern B
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <=  number - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Space between patterns
        System.out.println();

        // Design Pattern C
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Space between patterns
        System.out.println();

        // Design Pattern D
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=  number - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
