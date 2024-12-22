package Exercises;

import java.util.Scanner;

public class AverageAcceleration {
    public static void main(String[] args) {
        double v0, v1, time, acceleration;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1 and time: ");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        time = input.nextDouble();

        acceleration = (v1 - v0) / time;

        System.out.println("The average acceleration is " + acceleration);
    }
}
