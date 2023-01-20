package ch04;

import java.util.Scanner;

/**
 * Write a program that prompts the user for two integers and then prints:

 * The sum
 * The difference
 * The product
 * The average
 * The distance (absolute value of the difference)
 * The maximum (the larger of the two)
 * The minimum (the smaller of the two)
 * 
 * Enhance the output so the numbers are properly aligned.
 * @bj.exercise E4.3, E4.4
 */
public class Operations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input two integers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        System.out.printf("Sum: %13d%n", a + b);
        System.out.printf("Difference: %6d%n", a - b);
        System.out.printf("Product: %9d%n", a * b);
        System.out.printf("Average: %12.2f%n", (a + b) / 2.0);
        System.out.printf("Distance: %8d%n", Math.abs(b - a));
        System.out.printf("Maximum: %9d%n", Math.max(a, b));
        System.out.printf("Minimum: %9d%n", Math.min(a, b));
    }
}
