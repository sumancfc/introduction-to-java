import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        double length, width, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextDouble();

        area = length * width;

        System.out.println("The area of the rectangle is " + area);
    }
}