/*(Conversion from kilograms to pounds and pounds to kilograms) Write a program
that displays the following two tables side by side:
Kilograms Pounds | Pounds Kilograms
1 2.2 | 20 9.09
        3 6.6 | 25 11.36
        ...
        197 433.4 | 510 231.82
        199 437.8 | 515 234.09*/

package Loops;

public class KilogramsToPoundsAndViceVersa {
    public static void main(String[] args) {
        final double KILOGRAMS_TO_POUND = 2.2;
        final double POUNDS_TO_KILOGRAM = 1 / KILOGRAMS_TO_POUND;

        System.out.printf("%-10s %-10s | %-10s %-10s", "Kilograms", "Pounds", "Pounds", "Kilograms");

        int poundStart = 20;

        for(int kilograms = 1, pounds = poundStart; kilograms <= 199; kilograms +=2, pounds += 5) {
            double poundsFromKilogram = kilograms * KILOGRAMS_TO_POUND;
            double kilogramsFromPounds = pounds * POUNDS_TO_KILOGRAM;

            System.out.printf("%-10d %-10.1f | %-10d %-10.2f%n", kilograms, poundsFromKilogram, pounds, kilogramsFromPounds);
        }
    }
}
