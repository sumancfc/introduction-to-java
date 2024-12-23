package Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;

        // off-by-one error
       // while(count <= 10) {}

        while (count < 10) {
            System.out.println("Welcome to Java");
            count++;
        }
    }
}
