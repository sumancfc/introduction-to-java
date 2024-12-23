package Loops;

public class FutureTuition {
/*    public static void main(String[] args) {
        double tuitionFee = 10000;
        int year;
        *//* while ( tuitionFee < 20000) {
            tuitionFee = tuitionFee * 1.07;
            year++;
        }*//*

        for (year = 0; tuitionFee < 20000; year++) {
            tuitionFee = tuitionFee * 1.07;
        }

        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuitionFee, year);
    }*/
    public static void main(String[] args) {
        // Initial tuition and annual increase rate
        double tuition = 10000;
        double annualIncreaseRate = 0.05;

        // Compute tuition after 10 years
        for (int year = 1; year <= 10; year++) {
            tuition *= (1 + annualIncreaseRate);
        }
        System.out.printf("Tuition in 10 years: $%.2f%n", tuition);

        // Compute the total cost of 4 years' tuition after the 10th year
        double totalCost = 0;
        for (int year = 1; year <= 4; year++) {
            totalCost += tuition;
            tuition *= (1 + annualIncreaseRate);
        }
        System.out.printf("Total cost of 4 years’ tuition after the 10th year: $%.2f%n", totalCost);
    }
}
