package ch06;

import java.util.Random;
import java.util.Scanner;

/**
 * Randomly permute the characters of a string.
 *
 * @bj.exercise E6.7
 */
public class RandomPermutation {

    public static void main(String[] args) {
        final boolean DEBUG = System.getenv("DEBUG") != null;

        Scanner in = new Scanner(System.in);

        System.out.print("String: ");
        String word = in.next();

        Random rand = new Random();

        for (int n = 0; n < word.length(); n++) {
            int lastIndex = word.length() - 1; // index of last char
            int i = rand.nextInt(lastIndex); // [0, len)
            int j = rand.nextInt(lastIndex - i) + i + 1; // (i, len), j > i

            word =
                word.substring(0, i) +
                word.charAt(j) +
                word.substring(i + 1, j) +
                word.charAt(i) +
                word.substring(j + 1);

            if (DEBUG) {
                System.out.printf("i = %s, j = %s%n", i, j);
                System.out.println(word);
            }
        }

        System.out.println(word);

        in.close();
    }
}
