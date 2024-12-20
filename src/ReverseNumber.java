 import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number, reverse= 0, reminder;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while(number != 0) {
            reminder = number %10;
            reverse = reverse * 10 + reminder;
            number /= 10;
        }

        System.out.println("The reverse number is: " + reverse);

    }
}
