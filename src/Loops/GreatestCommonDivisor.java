package Loops;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int gcd = 1;
        //int k = 2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

/*        while ( k <= number1 && k <= number2 ) {
            if (number1 % k == 0 && number2 % k== 0) {
                gcd = k;
            }
            k++;
        }*/

        for ( int k = 2; k <= number1 && k<= number2; k++){
            if (number1 % k == 0 && number2 % k== 0) {
                gcd = k;
            }
        }
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + gcd);
    }
}
