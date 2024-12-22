package Selections;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // generate a lottery number
        int lottery = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guessNumber = input.nextInt();

        // get digits from lottery
        int lotteryDigits1 = lottery / 10;
        int lotteryDigits2 = lottery % 10;

        // get the digits from guess number
        int guessDigits1 = guessNumber / 10;
        int guessDigits2 = guessNumber % 10;

        System.out.println(guessDigits1);
        System.out.println(guessDigits2);

        if (guessNumber == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigits2 == lotteryDigits1 && guessDigits1 == lotteryDigits2) {
            System.out.println("Match all digits: you win $3,000");
        }else if (guessDigits1 == lotteryDigits1
                || guessDigits1 == lotteryDigits2
                || guessDigits2 == lotteryDigits1
                || guessDigits2 == lotteryDigits2) {
            System.out.println("Match one digit: you win $1,000");
        }else {
            System.out.println("Sorry, no match");

        }
    }
}
