package Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
/*        Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        do {
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);
        System.out.println("max is " + max);
        System.out.println("number " + number);*/

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter an integer " + "(the input ends if it is 0)");
            number = input.nextInt();
            if (number != 0) {
                sum += number;
            }
        }while (number != 0);

        System.out.println("The sum is " + sum);
    }
}
