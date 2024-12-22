package Selections;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }

        if (num % 5 == 0) {
            System.out.println("HiFive");
        }
    }
}
