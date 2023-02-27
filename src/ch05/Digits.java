package ch05;

import java.util.Scanner;

/**
 * Write a program that reads an integer and prints how many digits the number
 * has, by checking whether the number is ≥ 10, ≥ 100, and so on. (Assume that
 * all integers are less than ten billion.) If the number is negative, first
 * multiply it with –1.
 *
 * @bj.exercise E5.3
 */
public class Digits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");

        int num = in.nextInt(); // does not work for >= 2,147,483,647
        int digits;

        if (num < 0) {
            num *= -1;
        }

        if (num >= 1_000_000_000) {
            digits = 10;
        } else if (num >= 100_000_000) {
            digits = 9;
        } else if (num >= 10_000_000) {
            digits = 8;
        } else if (num >= 1_000_000) {
            digits = 7;
        } else if (num >= 100_000) {
            digits = 6;
        } else if (num >= 10_000) {
            digits = 5;
        } else if (num >= 1_000) {
            digits = 4;
        } else if (num >= 100) {
            digits = 3;
        } else if (num >= 10) {
            digits = 2;
        } else {
            digits = 1;
        }

        System.out.println(digits);

        in.close();
    }
}
