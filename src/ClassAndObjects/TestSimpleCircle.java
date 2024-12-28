package ClassAndObjects;

public class TestSimpleCircle {
    public static void main(String[] args) {
        // Calculate the area and perimeter of circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of a circle with radius " + circle1.radius + " is " + circle1.getArea() );
        System.out.println("The perimeter of a circle with radius " + circle1.radius + " is " + circle1.getPerimeter() );
        // Calculate the area of circle and perimeter with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of a circle with radius " + circle2.radius + " is " + circle2.getArea() );
        System.out.println("The perimeter of a circle with radius " + circle2.radius + " is " + circle2.getPerimeter() );
    }
}

class SimpleCircle {
    double radius;
    // Construct the circle with radius 1
    SimpleCircle() {
       this.radius = 1;
    }

    // Construct the circle with a specified radius
    SimpleCircle(double newRadius) {
        this.radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}