/*(Conversion from miles to kilometers) Write a program that displays the following table
        (note that 1 mile is 1.609 kilometers):*/
package Loops;

public class MilesToKilometers {
    public static void main(String[] args) {
        final double MILES_TO_KILOMETERS = 1.609;

        System.out.println("Miles\t\tKilometers");

        for(int miles = 1; miles <=10; miles++) {
            double kilometers = MILES_TO_KILOMETERS * miles;

            System.out.printf("%-10d\t%.2f%n", miles, kilometers);
        }
    }
}
