package ch02;

/**
 * P2.8 Using the Day class of Worked Example 2.1, write a program that
 * generates a Day object representing February 28 of this year, and three more
 * such objects that represent February 28 of the next three years. Advance each
 * object by one day, and print each object. Also print the expected values.
 *
 * This program assumes the current year is 2022.
 */
public class DayPrinter {

    public static void main(String[] main) {
        String[] expectedResults = {
            "2022-02-28",
            "2022-03-01",
            "2023-02-28",
            "2023-03-01",
            "2024-02-28",
            "2024-02-29",
            "2025-02-28",
            "2025-03-01",
        };

        for (int i = 0; i < 4; i++) {
            Day day = new Day(2022 + i, 2, 28);
            System.out.println(day);
            System.out.println("Expected: " + expectedResults[i * 2]);

            day = nextYear(day.addDays(1));
            System.out.println(day);
            System.out.println("Expected: " + expectedResults[i * 2 + 1]);
        }
    }

    public static Day nextYear(Day day) {
        return new Day(day.getYear() + 1, day.getMonth(), day.getDate());
    }
}
