package Exercises;

import java.util.Scanner;

public class FindNumberOfYears {
    public static void main(String[] args) {
        final int DAYS_IN_ONE_YEAR = 365;
        final int HOURS_IN_ONE_DAY = 24;
        final int MINUTES_IN_ONE_HOUR = 60;

        int minutes, hours, years, days, currentDays;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextInt();

        hours = minutes / MINUTES_IN_ONE_HOUR;
        days = hours / HOURS_IN_ONE_DAY;
        years = days / DAYS_IN_ONE_YEAR;
        currentDays = days % DAYS_IN_ONE_YEAR;

        System.out.println(minutes +  " minutes is approximately " + years + " years and  " + currentDays + " days");
    }
}
