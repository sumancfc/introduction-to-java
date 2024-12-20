import java.util.Scanner;
// import java.lang.Math;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Radius of Circle: ");
        radius = input.nextDouble();

        area = PI * radius * radius;
        //area = radius * radius * Math.PI;

        System.out.print("The Area of Circle is: " + area);
    }
}