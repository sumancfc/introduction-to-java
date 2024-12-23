package Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
/*        for(int i = 1; i <= 10; i++) {
            System.out.println("Welcome to Java");
        }
        int sum = 0;
        *//*for (int i = 0; i < 10; ++i) {
            sum += i;
        }*//*

        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);*/


        Scanner input = new Scanner(System.in);

        int number, sum = 0, count;
        for (count = 0; count < 5; count++) {
            number = input.nextInt();
            sum += number;
        }
        System.out.println("sum is " + sum);
        System.out.println("count is " + count);

    }
}
