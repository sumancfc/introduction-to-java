package Chapter4;

import java.util.Scanner;

public class OrderThreeCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();

        String temp;

        // Compare first and second cities
        if (firstCity.compareTo(secondCity) > 0) {
            temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }

        // Compare second and third cities
        if (secondCity.compareTo(thirdCity) > 0) {
            temp = secondCity;
            secondCity = thirdCity;
            thirdCity = temp;
        }

        // Compare first and second cities again
        if (firstCity.compareTo(secondCity) > 0) {
            temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }

        // Output the cities in alphabetical order
        System.out.println("The cities in alphabetical order are: " + firstCity + " " + secondCity + " " + thirdCity);
    }
}
