package ch06;

import java.util.Scanner;

/**
 * Write programs that read a sequence of integer inputs and print
 *
 * The smallest and largest of the inputs.
 * The number of even and odd inputs.
 * Cumulative totals. For example, if the input is `1 7 2 9`, the program
 * should print `1 8 10 19`.
 * All adjacent duplicates. For example, if the input is
 * `1 3 3 4 5 5 6 6 6 2`, the program should print `3 5 6`.
 *
 * @bj.exercise E6.2
 *
 */
public class Sequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter input sequence (any other key to stop): ");

        int next = in.nextInt();

        int min = next;
        int max = next;
        int numEven = 1 - next % 2;
        int numOdd = next % 2;
        int total = next;
        String totalStr = total + " ";
        String dupeStr = "";

        int prev;
        int prev2 = next + 1;

        do {
            prev = next;
            next = in.nextInt();

            if (next < min) {
                min = next;
            }
            if (next > max) {
                max = next;
            }

            if (next % 2 == 0) {
                numEven++;
            } else {
                numOdd++;
            }

            total += next;
            totalStr += total + " ";

            // check for duplicates and duplicate chain
            if (next == prev && next != prev2) {
                dupeStr += next + " ";
            }

            prev2 = prev; // store previous two values for duplicate chain
        } while (in.hasNextInt());

        if (dupeStr.isEmpty()) {
            dupeStr = "None";
        }

        System.out.println();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Even: " + numEven);
        System.out.println("Odd: " + numOdd);
        System.out.println("Total: " + totalStr.trim());
        System.out.println("Duplicates: " + dupeStr.trim());

        in.close();
    }
}
