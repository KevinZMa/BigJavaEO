package ch04;

import java.util.Scanner;

/**
 * An online bank wants you to create a program that shows prospective customers
 * how their deposits will grow. Your program should read the initial balance
 * and the annual interest rate. Interest is compounded monthly. Print out the
 * balances after the first three months.
 *
 * @bj.extra
 */
public class Balance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Initial balance: ");
        double balance = in.nextDouble();

        System.out.print("Annual interest rate in percent: ");
        double interest = in.nextDouble();

        // separator for distinction between input and output
        System.out.println("---");
        in.close();

        System.out.printf(
            "After first month:%12.2f%n",
            applyInterest(balance, interest, 1, 12)
        );
        System.out.printf(
            "After second month:%11.2f%n",
            applyInterest(balance, interest, 2, 12)
        );
        System.out.printf(
            "After third month:%12.2f%n",
            applyInterest(balance, interest, 3, 12)
        );
    }

    /**
     * Apply interest to an amount of money
     *
     * @param initial Initial amount of money
     * @param rate    Interest rate
     * @param times   Number of compounding periods
     * @param perYear Times compounded per year
     * @return
     */
    private static double applyInterest(
        double initial,
        double rate,
        int times,
        int perYear
    ) {
        return initial * Math.pow(1 + ((rate / 100) / perYear), times);
    }
}
