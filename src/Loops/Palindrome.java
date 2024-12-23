package Loops;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // Check if it's a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string reads the same backward and forward
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
