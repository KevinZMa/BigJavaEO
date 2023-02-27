package ch05;

import java.util.Scanner;

/**
 * Write a program that reads an integer and prints whether it is negative,
 * zero, or positive.
 *
 * @bj.exercise E5.1
 */
public class IntegerType {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");

        int num = in.nextInt();
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        in.close();
    }
}
