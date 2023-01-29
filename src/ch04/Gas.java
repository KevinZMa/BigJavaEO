package ch04;

import java.util.Scanner;

/**
 * Write a program that asks the user to input:
 *
 * The number of gallons of gas in the tank
 * The fuel efficiency in miles per gallon
 * The price of gas per gallon
 *
 * Then print the cost per 100 miles and how far the car can go with the gas in
 * the tank.
 *
 * @bj.exercise E4.9
 */
public class Gas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Gallons in tank: ");
        double gallons = in.nextDouble();

        System.out.print("Fuel efficiency (mpg): ");
        double efficiency = in.nextDouble();

        System.out.print("Price of gas per gallon: ");
        double price = in.nextDouble();

        in.close();

        System.out.println("---");

        // see calculations in README file
        System.out.printf(
            "Cost per 100 miles: %.2f%n",
            100 / efficiency * price
        );
        System.out.printf(
            "How far the car can go: %.2f miles%n",
            gallons * efficiency
        );
    }
}
