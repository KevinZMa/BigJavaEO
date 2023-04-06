package ch06;

import java.util.Scanner;

/**
 * Displays, using asterisks, a filled and hollow square placed next to each other.
 *
 * @bj.exercise E6.17
 */
public class Squares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Size: ");
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }

            System.out.print(" ");

            for (int k = 0; k < size; k++) {
                if (i == 0 || k == 0 || i == size - 1 || k == size - 1) {
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
