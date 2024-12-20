import java.util.Scanner;

// Testing code Here
public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a int value: ");
        // byte byteValue = input.nextByte();
        int value = input.nextInt();

        // System.out.print("The given value is " + byteValue);
        System.out.print("The given int value is " + value);
    }
}
