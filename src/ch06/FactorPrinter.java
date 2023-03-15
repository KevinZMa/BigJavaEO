package ch06;

import java.util.Scanner;

/**
 * Write a program that asks the user for an integer and then prints out all its
 * factors.
 *
 * @bj.project P6.3
 */
public class FactorPrinter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Number to factor: ");
        int num = in.nextInt();

        in.close();

        FactorGenerator gen = new FactorGenerator(num);
        while (gen.hasMoreFactors()) {
            System.out.println(gen.nextFactor());
        }
    }
}
