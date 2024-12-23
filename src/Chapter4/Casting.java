package Chapter4;

public class Casting {
    public static void main(StringType[] args) {
       /* char ch =  (char)0XAB0041;*/
/*        char ch = (char)65.25;

        int i = (int)'A';
        System.out.println(ch);
        System.out.println(i);

        //byte b = 'a';
        int a = 'a';

        byte b = (byte)'\uFFF4';

        System.out.println(b);
        System.out.println(a);*/

        char ch = 'a';

/*        System.out.println("isDigit('a') is " + Character.isDigit(ch));
        System.out.println("isLetter('a') is " + Character.isLetter(ch));
        System.out.println("isUpperCase('a') is " + Character.isUpperCase(ch));
        System.out.println("isUpperCase('a') is " + Character.isLowerCase(ch));
        System.out.println("isLowerCase('a') is " + Character.toLowerCase('S'));*/

        System.out.println('a' < 'b');
        System.out.println('a' <= 'A');
        System.out.println('a' > 'b');
        System.out.println('a' >= 'A');
        System.out.println('a' == 'a');
        System.out.println('a' != 'b');

/*
        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an uppercase letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " is a lowercase letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println(ch + " is a numeric character");
*/

    }
}
