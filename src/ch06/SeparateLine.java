package ch06;

import java.util.Scanner;

/**
 * Write a program that reads a word and prints each character of the word on a
 * separate line.
 *
 * @bj.exercise E6.8
 */
public class SeparateLine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("String: ");
        String word = in.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        in.close();
    }
}
