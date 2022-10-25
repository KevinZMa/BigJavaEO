import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * P2.9 Your task is to write a program that prints:

 * The date and weekday that is 100 days from today.
 * The weekday of someone's birthday.
 * The date that is 10,000 days from someone's birthday.
 */
public class CalendarExtra {

    public static final String[] daysOfWeek = {
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
    };

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_YEAR, 100);
        System.out.printf(
            "100 days from today is %s (%s)%n",
            CalendarExtra.formatDate(cal),
            CalendarExtra.dayOfWeek(cal)
        );

        GregorianCalendar bday = new GregorianCalendar(1956, 1, 31);
        System.out.printf(
            "The weekday of Guido van Rossum's birthday is %s%n",
            CalendarExtra.dayOfWeek(bday)
        );

        bday.add(Calendar.DAY_OF_YEAR, 10_000);
        System.out.printf(
            "10,000 days from Guido van Rossum's birthday is %s (%s)%n",
            CalendarExtra.formatDate(bday),
            CalendarExtra.dayOfWeek(bday)
        );
    }

    public static String formatDate(Calendar cal) {
        return (
            cal.get(Calendar.YEAR) +
            "-" +
            cal.get(Calendar.MONTH) +
            "-" +
            cal.get(Calendar.DAY_OF_MONTH)
        );
    }

    public static String dayOfWeek(Calendar cal) {
        return daysOfWeek[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }
}
