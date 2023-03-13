package ch06;

import java.util.Scanner;

/**
 * Implement a program that prompts the user for an integer n and prints the nth
 * Fibonacci number, using the algorithm in the README.
 *
 * @bj.project P6.2
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n: ");
        int n = in.nextInt();

        in.close();

        // first and second fibonacci numbers
        int fold1 = 1;
        int fold2 = 1;
        int fnew = fold1 + fold2;

        // start from the third fibonacci number
        for (int i = 0; i < n - 3; i++) {
            fold2 = fold1;
            fold1 = fnew;
            fnew = fold1 + fold2;
        }

        System.out.println(fnew);
    }
}
