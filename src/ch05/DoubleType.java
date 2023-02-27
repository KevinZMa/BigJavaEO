package ch05;

import java.util.Scanner;

/**
 * Write a program that reads a floating-point number and prints "zero" if the
 * number is zero. Otherwise, print "positive" or "negative". Add "small" if the
 * absolute value of the number is less than 1, or "large" if it exceeds
 * 1,000,000.
 *
 * @bj.exercise E5.2
 */
public class DoubleType {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");

        double num = in.nextDouble();
        if (num > 0) {
            System.out.println("positive");
            if (num < 1) {
                System.out.println("small");
            }
            if (num > 1_000_000) {
                System.out.println("large");
            }
        } else if (num < 0) {
            System.out.println("negative");
            if (num > -1) {
                System.out.println("small");
            }
        } else {
            System.out.println("zero");
        }

        in.close();
    }
}
