import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int number, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("The sum of a digit is: " + sum);
    }
}
