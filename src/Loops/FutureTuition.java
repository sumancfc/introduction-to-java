package Loops;

public class FutureTuition {
    public static void main(String[] args) {
        double tuitionFee = 10000;
        int year;
        /* while ( tuitionFee < 20000) {
            tuitionFee = tuitionFee * 1.07;
            year++;
        }*/

        for (year = 0; tuitionFee < 20000; year++) {
            tuitionFee = tuitionFee * 1.07;
        }

        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuitionFee, year);
    }
}
