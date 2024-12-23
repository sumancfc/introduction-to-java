package Loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100: ");

        int guess = -1;

        while (guess != number) {
            System.out.print("Enter your Guess: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Congratulations! You have guessed it!");
            }else if (guess > number) {
                System.out.println("Your number is too high!");
            }else {
                System.out.println("Your number is too low!");
            }
        }
    }
}
