package ch04;

import static java.lang.Math.PI;

import java.util.Scanner;

/**
 * Write a program that prompts the user for a radius and then prints:

 * The area and circumference of a circle with that radius
 * The volume and surface area of a sphere with that radius
 * 
 * @bj.exercise E4.6
 */
public class CircularDimensions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Radius: ");
        double r = in.nextDouble();

        in.close();

        System.out.println("---");
        System.out.printf("Area: %.2f%n", PI * r * r);
        System.out.printf("Circumference: %.2f%n", 2 * PI * r);
        System.out.printf("Volume: %.2f%n", (4.0 / 3.0) * PI * Math.pow(r, 3));
        System.out.printf("Surface Area: %.2f%n", 4 * PI * r * r);
    }
}
