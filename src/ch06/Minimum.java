package ch06;

import java.util.Scanner;

/**
 * Find the minimum value from a set of inputs. (see pseudocode in README)
 *
 * @bj.exercise E6.6
 */
public class Minimum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean first = true;
        int minimum = 0;
        int next;

        while (in.hasNextInt()) {
            next = in.nextInt();

            if (first) {
                minimum = next;
                first = false;
            } else if (next < minimum) {
                minimum = next;
            }
        }

        System.out.println("Minimum:" + minimum);

        in.close();
    }
}
