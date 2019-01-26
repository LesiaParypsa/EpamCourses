package homework.lesson8;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        String date = "2019-01-24";
        DateTime testTime = DateTime.parse(date, DateTimeFormat.forPattern("yyyy-MM-dd"));

        String convertedDate1 = convertDateToFormat(testTime, "dd-MM-yyyy");
        String convertedDate2 = convertDateToFormat(testTime, "dd/MM/yyyy");

        System.out.println("Initial date: " + date);
        System.out.println("Converted date: " + convertedDate1);
        System.out.println("Converted date: " + convertedDate2);


        long tsAtTheStartOfTheDay = new DateTime().withTimeAtStartOfDay().getMillis();
        System.out.println("\nStart of the day: " + tsAtTheStartOfTheDay);

        long tsAtTheStartOfTheDay1 = new DateTime().withTime(0, 0, 0, 0).getMillis();
        System.out.println("Start of the day: " + tsAtTheStartOfTheDay1);

        long tsAtTheEndOfTheDay = new DateTime().withTime(23, 59, 59, 999).getMillis();
        System.out.println("End of the day: " + tsAtTheEndOfTheDay + "\n");

        String dateAtTheEndOfTheDay = convertTsToFormat(tsAtTheEndOfTheDay, "dd/MM/yyyy HH:mm");
        System.out.println("Converted date from ts: " + dateAtTheEndOfTheDay + "\n");


        DateTime date1 = new DateTime(2019, 3, 24, 15, 40);
        System.out.println("Date 1: " + date1);
        DateTime date2 = new DateTime(2019, 3, 24, 15, 40);
        System.out.println("Date 2: " + date2);

        switch (compareTwoDates(date1, date2)) {
            case -1:
                System.out.println("Date 1 is before Date 2");
                break;
            case 1:
                System.out.println("Date 1 is after Date 2");
                break;
            default:
                System.out.println("Date 1 and Date 2 are equal");
                break;
        }

        String dayOfWeek = getDayOfWeekFromTs(1548453600000L);
        System.out.println("\n" + dayOfWeek);
    }

    public static String convertDateToFormat(DateTime date, String format) {
        return date.toString(format);
    }

    public static String convertTsToFormat(long ts, String format) {
        DateTime date = new DateTime(ts);
        return date.toString(format);
    }

    public static int compareTwoDates(DateTime dt1, DateTime dt2) {
        if (dt1.isBefore(dt2)) {
            return -1;
        } else if (dt1.isAfter(dt2)) {
            return 1;
        } else return 0;
    }

    public static String getDayOfWeekFromTs(long ts) {
        DateTime date = new DateTime(ts);
        return date.dayOfWeek().getAsText(Locale.GERMANY);
    }
}
