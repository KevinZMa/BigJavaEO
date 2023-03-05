package ch06;

import java.util.Scanner;

/**
 * Write programs that read a line of input as a string and print
 *
 * Only the uppercase letters in the string.
 * Every second letter of the string.
 * The string, with all vowels replaced by an underscore.
 * The number of vowels in the string.
 * The positions of all vowels in the string.
 *
 * @bj.exercise E6.3
 */
public class StringAnalyzer {

    private static final String VOWELS = "aeiouAEIOU";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input: ");
        String s = in.nextLine();

        in.close();

        String upper = "";
        String second = "";
        String noVowels = "";
        int numVowels = 0;
        String vowelPositions = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper += ch;
            }
            if (i % 2 != 0) {
                second += ch;
            }
            if (VOWELS.indexOf(ch) != -1) {
                numVowels++;
                vowelPositions += i + " ";
            } else {
                noVowels += ch;
            }
        }

        System.out.println();
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Every second letter: " + second);
        System.out.println("Vowels: " + numVowels);
        System.out.println("Without vowels: " + noVowels);
        System.out.println("Vowel positions: " + vowelPositions.trim());
    }
}
