/*(Conversion from kilograms to pounds) Write a program that displays the following table
        (note that 1 kilogram is 2.2 pounds):*/
package Loops;

public class KilogramToPounds {
    public static void main(String[] args) {
        final double KILOGRAM_TO_POUND = 2.2;

        System.out.println("Kilograms\t\tPounds");

        for(int kilograms = 1; kilograms <= 199; kilograms +=2) {
            double pounds =(double) kilograms * KILOGRAM_TO_POUND;
            System.out.printf("%-10d\t%.1f%n", kilograms, pounds);
        }

    }
}
