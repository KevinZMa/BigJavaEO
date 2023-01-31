package ch04;

import java.util.Scanner;

/**
 * Write a program that helps a person decide whether to buy a hybrid car. Your
 * program’s inputs should be:
 *
 * The cost of a new car
 * The estimated miles driven per year
 * The estimated gas price
 * The efficiency in miles per gallon
 * The estimated resale value after 5 years
 *
 * Compute the total cost of owning the car for five years. (For simplicity, we
 * will not take the cost of financing into account.) Obtain realistic prices
 * for a new and used hybrid and a comparable car from the Web. Run your program
 * twice, using today’s gas price and 15,000 miles per year. Include pseudocode
 * and the program runs with your assignment.
 *
 * @bj.project P4.1
 */
public class HybridCarDecider {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Cost of a new car: ");
        double cost = in.nextDouble();

        System.out.print("Estimated miles driven per year: ");
        double milesPerYear = in.nextDouble();

        System.out.print("Estimated gas price: ");
        double gasPrice = in.nextDouble();

        System.out.print("Efficiency (miles per gallon): ");
        double efficiency = in.nextDouble();

        System.out.print("Estimated resale value after 5 years: ");
        double resaleValue = in.nextDouble();

        in.close();

        // see calculations in README (E4.9)
        double gasCost = (milesPerYear / efficiency) * gasPrice;

        System.out.println();
        System.out.printf("Cost: %.2f%n", cost + gasCost - resaleValue);
    }
}
