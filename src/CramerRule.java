public class CramerRule {
    public static void main(String[] args) {
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = .55, f = 5.9;

        // Calculate the Denominator
        double denominator = (a * d - b * c);

        if (denominator == 0) {
            System.out.println("The system of equations has no unique solution.");
        }else {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e + c) / denominator;

            // Display the results
            System.out.println("The value of x is: " + x);
            System.out.println("The value of y is: " + y);
        }
    }
}
