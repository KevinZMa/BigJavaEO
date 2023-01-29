package ch04;

import java.util.Scanner;

/**
 * Write a program that asks the user for the lengths of a rectangle's sides.
 * Then print:
 *
 * The area and perimeter of the rectangle
 * The length of the diagonal (use the Pythagorean theorem)
 *
 * @bj.exercise E4.7
 */
public class RectangleDimensions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input side lengths: ");
        double s1 = in.nextDouble();
        double s2 = in.nextDouble();

        in.close();

        System.out.printf("Area: %.2f%n", s1 * s2);
        System.out.printf("Perimeter: %.2f%n", 2 * (s1 + s2));
        System.out.printf("Diagonal: %.2f%n", Math.sqrt(s1 * s1 + s2 * s2));
    }
}
