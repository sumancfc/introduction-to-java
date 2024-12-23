package Methods;

public class TestPassByValue {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;

        System.out.println("Before Swap, the value of num1 is: " + num1 + " and the value of num2 is: " + num2);

        swap(num1, num2);

        System.out.println("After Swap, the value of num1 is: " + num1 + " and the value of num2 is: " + num2);
    }

    public static void swap(int num1, int num2) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore Swap, the value of num1 is: " + num1 + " and the value of num2 is: " + num2 );

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\t\tAfter Swap, the value of num1 is: " + num1 + " and the value of num2 is: " + num2 );

    }
}
