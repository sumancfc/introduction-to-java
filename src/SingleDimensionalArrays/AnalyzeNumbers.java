package SingleDimensionalArrays;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items : ");
        int num = input.nextInt();

        double [] numbers = new double[num];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < num; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / num;

        int count = 0;

        for (int i = 0; i < num; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("The average number is : " + average);
        System.out.println("Number of elements above the average is " + count);

    }
}
