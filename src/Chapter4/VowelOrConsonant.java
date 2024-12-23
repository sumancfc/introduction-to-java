package Chapter4;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);

        if(Character.isLetter(ch)) {
            String vowels = "aeiouAEIOU";

            if (vowels.indexOf(ch) != -1) {
                System.out.println(ch + " is a vowel");
            }else {
                System.out.println(ch + " is not a consonant");
            }
        }else {
            System.out.println(ch + " is an invalid input");
        }

/*        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                System.out.println(ch + " is a vowel");
            }else {
                System.out.println(ch + " is a consonant");
            }
        }else {
            System.out.println(ch + " is an invalid input");
        }*/
    }
}
