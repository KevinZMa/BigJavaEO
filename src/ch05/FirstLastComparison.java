package ch05;

import java.util.Scanner;

/**
 * Write a program that reads a string, compares the first and last letter, and
 * and prints "first and last letter same" or "first and last letter different".
 *
 * @bj.exercise E5.4
 */
public class FirstLastComparison {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input string: ");
        String str = in.next();

        if (str.substring(0, 1).equals(str.substring(str.length() - 1))) {
            System.out.println("first and last letter same");
        } else {
            System.out.println("first and last letter different");
        }

        in.close();
    }
}
