package ch04;

import java.util.Scanner;

/**
 * Write a program that reads a number and displays the square, cube, and fourth
 * power. Use the `Math.pow` method only for the fourth power.
 *
 * @bj.exercise E4.2
 */
public class Powers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        double num = in.nextDouble();

        in.close();

        System.out.printf(
            "Square: %.2f%nCube: %.2f%nFourth: %.2f%n",
            num * num,
            num * num * num,
            Math.pow(num, 4.0)
        );
    }
}
