public class ShowCurrentTime {
    public static void main(String[] args) {
        // get the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // get total seconds
        long totalSeconds = totalMilliseconds / 1000;
        // get current seconds
        long currentSecond = totalSeconds % 60;
        // get total minutes
        long totalMinutes = totalSeconds / 60;
        // get current Minutes
        long currentMinute = totalMinutes % 60;
        // get total hours
        long totalHours = totalMinutes / 60;
        // get current hours
        long currentHour = totalHours % 24;

        // current time in Germany
        long currentHourInGermany = currentHour + 1;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        System.out.println("Current time in Germany is " + currentHourInGermany + ":" + currentMinute + ":" + currentSecond + " Berlin Time");
      }
    }

