package ch05;

import java.util.Scanner;

/**
 * Calculating the tip when you go to a restaurant is not difficult, but your
 * restaurant wants to suggest a tip according to the service diners receive.
 * Write a program that calculates a tip according to the diner’s satisfaction
 * as follows:
 *
 * Ask for the diners’ satisfaction level using these ratings: 1 = Totally
 * satisfied, 2 = Satisfied, 3 = Dissatisfied.
 * If the diner is totally satisfied, calculate a 20 percent tip.
 * If the diner is satisfied, calculate a 15 percent tip.
 * If the diner is dissatisfied, calculate a 10 percent tip.
 * Report the satisfaction level and tip in dollars and cents.
 *
 * @bj.project P5.14
 */
public class Tip {

    private static final String[] SATISFACTION = {
        "Totally satisfied",
        "Satisfied",
        "Dissatisfied",
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Amount: ");

        if (!in.hasNextDouble()) {
            System.out.println("Invalid input");
            in.close();
            return;
        }
        double amount = in.nextDouble();

        System.out.println(
            "1 = Totally satisfied, 2 = Satisfied, 3 = Dissatisfied"
        );
        System.out.print("Satisfaction: ");

        if (!in.hasNextInt()) {
            System.out.println("Invalid input");
            in.close();
            return;
        }
        int satisfaction = in.nextInt();

        if (satisfaction < 1 || satisfaction > 3) {
            System.out.println("Invalid input");
            in.close();
            return;
        }

        in.close();

        double tipRate = .25 - .05 * satisfaction;

        System.out.println();
        System.out.printf(
            "%s%nTip: $%.2f (%.0f%%)%n",
            SATISFACTION[satisfaction - 1],
            tipRate * amount,
            tipRate * 100
        );
    }
}
