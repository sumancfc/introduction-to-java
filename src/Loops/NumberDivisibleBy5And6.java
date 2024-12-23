/*(Find numbers divisible by 5 and 6) Write a program that displays all the numbers from 100 to 1,000,
ten per line, that are divisible by 5 and 6. Numbers are separated by exactly one space.*/
package Loops;

public class NumberDivisibleBy5And6 {
    public static void main(String[] args) {
        final int NUMBER_PER_LINE = 10;
        int count = 0;

        for (int number = 100; number <= 1000; number++) {
            if(number % 5 == 0 && number % 6 == 0) {
                System.out.print(number + " ");
                count++;
                if(count  % NUMBER_PER_LINE == 0) {
                    System.out.println();
                }
            }
        }
    }
}
