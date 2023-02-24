package ch05;

import java.util.Scanner;

public class Season {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Month and day: ");
        int month = in.nextInt();
        int day = in.nextInt();

        in.close();

        Date date = new Date(month, day);
        System.out.println(date.getSeason());
    }

    static class Date {

        private final String[] SEASONS = {
            "Winter",
            "Spring",
            "Summer",
            "Fall",
        };

        private int month;
        private int day;

        public Date(int month, int day) {
            this.month = month;
            this.day = day;
        }

        public String getSeason() {
            int season = (month - 1) / 3;
            if (month % 3 == 0 && day >= 21) {
                season = (season + 1) % 4;
            }
            return SEASONS[season];
        }
    }
}
