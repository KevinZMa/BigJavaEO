package ch04;

import java.util.Scanner;

/**
 * Write a program that prompts the user for a measurement in meters and then
 * converts it to miles, feet, and inches.
 *
 * @bj.exercise E4.5
 */
public class Conversions {

    public static final double METERS_PER_MILE = 1609.344;
    public static final double FEET_PER_MILE = 5280;
    public static final double INCHES_PER_FOOT = 12;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Measurement (meters): ");
        double measurement = in.nextDouble();

        in.close();

        double miles = measurement / METERS_PER_MILE;
        System.out.printf("Miles: %.2f%n", miles);

        double feet = miles * FEET_PER_MILE;
        System.out.printf("Feet: %.2f%n", feet);

        double inches = feet * INCHES_PER_FOOT;
        System.out.printf("Inches: %.2f%n", inches);
    }
}
