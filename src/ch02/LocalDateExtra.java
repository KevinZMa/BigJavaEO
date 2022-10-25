import java.time.LocalDate;

/**
 * P2.10 Your task is to write a program that prints:

 * The weekday of "Pi day", that is, March 14, of the current year.
 * The date and weekday of "Programmer's day" in the current year; that is, the 256th day of the year. (The number 256, or 28, is useful for some programming tasks.)
 * The date and weekday of the date that is 10,000 days earlier than today.
 */
public class LocalDateExtra {

    public static void main(String[] args) {
        LocalDate piDay = LocalDate.of(2022, 3, 14);
        System.out.println("Pi Day: " + piDay);

        LocalDate programmersDay = LocalDate.of(2022, 1, 1).plusDays(255);
        System.out.printf(
            "Programmers' Day: %s (%s)%n",
            programmersDay,
            programmersDay.getDayOfWeek().toString()
        );

        LocalDate longTimeAgo = LocalDate.now().plusDays(-10_000);
        System.out.printf(
            "10,000 Days Ago: %s (%s)%n",
            longTimeAgo,
            longTimeAgo.getDayOfWeek().toString()
        );
    }
}
