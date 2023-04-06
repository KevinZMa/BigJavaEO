package ch06;

import java.util.Scanner;

/**
 * Prints an X shape in a box of a given side length.
 *
 * @bj.exercise E6.20
 */
public class Box {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Side length: ");
        int len = in.nextInt();

        // rows
        for (int i = 0; i < len; i++) {
            // columns
            for (int j = 0; j < len; j++) {
                if (
                    i == 0 || // first row
                    j == 0 || // first column
                    i == len - 1 || // last row
                    j == len - 1 || // last column
                    i == j || // top left to bottom right diagonal
                    i == len - 1 - j // bottom left to top right diagonal
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        in.close();
    }
}
