package Exercises;
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius, length, area, volume;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of the cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();

        area = radius * radius * PI;
        volume = length * area;
        System.out.printf("The area of the cylinder is %4.2f\n", area);
        System.out.printf("The volume of the cylinder is %4.2f\n", volume);

    }
}
