package Selections;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        double discriminant = (b * b - 4 * a *c);

        if (discriminant > 0){
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminant < 0){
            System.out.println("The equation has no real roots");
        } else  {
            System.out.println("The equation has one root " + r1);
        }

    }
}
