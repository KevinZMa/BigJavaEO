package ch04;

/**
 * Write a program that displays the properties of a letter-size (8.5 × 11
 * inches) sheet of paper in millimeters. There are 25.4 millimeters per inch.
 * The program should print:
 *
 * The width and height
 * The perimeter
 * The length of the diagonal
 * @bj.exercise E4.1
 */
public class SheetProperties {

    public static void main(String[] args) {
        final double MM_PER_INCH = 25.4;
        final double WIDTH_IN_INCHES = 8.5;
        final double LENGTH_IN_INCHES = 11.0;

        double width = WIDTH_IN_INCHES * MM_PER_INCH;
        double length = LENGTH_IN_INCHES * MM_PER_INCH;

        System.out.printf("Width: %.2f%n", width);
        System.out.printf("Length: %.2f%n", length);
        System.out.printf("Perimeter: %.2f%n", 2 * (width + length));
        System.out.printf(
            "Diagonal: %.2f%n",
            Math.sqrt(width * width + length * length)
        );
    }
}
