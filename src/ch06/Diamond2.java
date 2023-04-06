package ch06;

import java.util.Scanner;

/**
 * Prints a diamond shape, as in the preceding exercise, with the asterisks in
 * the middle row and column omitted.
 *
 * @bj.exercise E6.19
 */
public class Diamond2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Side length: ");
        int len = in.nextInt();

        // print top half
        for (int i = 1; i <= len; i++) {
            printRow(len, i);
        }

        System.out.println();

        // print bottom half
        for (int i = len; i > 0; i--) {
            printRow(len, i);
        }

        in.close();
    }

    private static void printRow(int width, int amount) {
        for (int i = 0; i < width - amount; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }

        System.out.print(" ");

        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < width - amount; i++) {
            System.out.print(" ");
        }

        System.out.println();
    }
}
