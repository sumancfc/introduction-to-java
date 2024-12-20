import java.util.Scanner;
import java.lang.Math;

public class AreaOfCircle {
    public static void main(String[] args) {
        double radius, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Radius of Circle: ");
        radius = input.nextDouble();

        area = radius * radius * Math.PI;

        System.out.print("The Area of Circle is: " + area);
    }
}