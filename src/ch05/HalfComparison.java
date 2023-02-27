package ch05;

import java.util.Scanner;

/**
 * Write a program that reads a word, compares the first and second half of the
 * word, and prints "first and second half same" or "first and second half
 * different". If the length of the word is odd, ignore the middle letter.
 *
 * @bj.exercise E5.5
 */
public class HalfComparison {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input string: ");
        String str = in.next();

        if (
            str
                .substring(0, str.length() / 2)
                .equals(str.substring((str.length() + 1) / 2))
        ) {
            System.out.println("first and second half same");
        } else {
            System.out.println("first and second half different");
        }

        in.close();
    }
}
