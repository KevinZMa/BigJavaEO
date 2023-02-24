package ch05;

import java.util.Scanner;

public class Horoscope {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your birthday (month and day): ");
        int month = in.nextInt();
        int day = in.nextInt();

        in.close();

        Date date = new Date(month, day);
        System.out.println(date.getFortune());
    }

    static class Date {

        private final String[] SIGNS = {
            "Aquarius", // January 21-February 18
            "Pisces", // February 19-March 20
            "Aries", // March 21-April 19
            "Taurus", // April 20-May 20
            "Gemini", // May 21-June 20
            "Cancer", // June 21-July 22
            "Leo", // July 23-August 22
            "Virgo", // August 23-September 22
            "Libra", // September 23-October 22
            "Scorpio", // October 23-November 21
            "Sagittarius", // November 22-December 21
            "Capricorn", // December 21-January 20
        };
        // prettier-ignore
        private final int[] START_DATES = { 20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 22, 22 };

        private int month;
        private int day;

        public Date(int month, int day) {
            this.month = month;
            this.day = day;
        }

        public String getSign() {
            if (month == 1 && day < START_DATES[0]) {
                return SIGNS[SIGNS.length - 1];
            }

            int index = month - 1;
            if (day < START_DATES[month - 1]) {
                index = (index + 11) % 12; // decrement month but add 12 to keep it positive
            }
            return SIGNS[index];
        }

        public String getFortune() {
            String sign = getSign();

            // note: This text was generated using ChatGPT.
            switch (sign) {
                case "Aquarius":
                    return "Aquarius are known for their innovative thinking. Today, you will have a breakthrough idea that will make your code more efficient.";
                case "Pisces":
                    return "Pisces are highly intuitive and sensitive. Today, trust your gut instincts when debugging a tricky issue.";
                case "Aries":
                    return "Aries are natural leaders and problem solvers. Today, you will take charge of a project and guide it to success.";
                case "Taurus":
                    return "Taurus are patient and persistent. Today, stick with a challenging coding problem until you find a solution.";
                case "Gemini":
                    return "Gemini are experts at figuring out the behavior of complicated programs. You feel where bugs are coming from and then stay one step ahead.";
                case "Cancer":
                    return "Cancer are highly empathetic and compassionate. Today, you will use your people skills to collaborate with others and create something great.";
                case "Leo":
                    return "Leos are confident and charismatic. Today, use your charm to persuade others to see things your way in a code review.";
                case "Virgo":
                    return "Virgos are detail-oriented and precise. Today, pay close attention to the small things in your code to catch potential bugs before they become big issues.";
                case "Libra":
                    return "Libras are known for their balance and harmony. Today, find a way to make your code more elegant and streamlined.";
                case "Scorpio":
                    return "Scorpios are resourceful and determined. Today, you will use your ingenuity to solve a difficult problem and impress your colleagues.";
                case "Sagittarius":
                    return "Sagittarius are adventurous and open-minded. Today, explore a new programming language or tool to expand your skill set.";
                case "Capricorn":
                    return "Capricorns are ambitious and hardworking. Today, focus on your long-term goals and take steps towards achieving them.";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }
}
