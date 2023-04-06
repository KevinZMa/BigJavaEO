package ch06;

import java.util.Scanner;

/**
 * Displays, using asterisks, a filled diamond of the given side length.
 *
 * @bj.exercise E6.18
 */
public class Diamond {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Side length: ");
        int len = in.nextInt();

        int width = len * 2 - 1;

        // print top half
        for (int i = 1; i <= len; i++) {
            int middle = i * 2 - 1;
            int spaces = (width - middle) / 2;
            printRow(spaces, middle);
        }

        // print bottom half
        for (int i = len - 1; i > 0; i--) {
            int middle = i * 2 - 1;
            int spaces = (width - middle) / 2;
            printRow(spaces, middle);
        }

        in.close();
    }

    private static void printRow(int spaces, int middle) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < middle; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }

        System.out.println();
    }
}
