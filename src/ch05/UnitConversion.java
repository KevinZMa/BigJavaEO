package ch05;

import java.util.Scanner;

/**
 * Write a unit conversion program that asks the users from which unit they want
 * to convert (fl. oz, gal, oz, lb, in, ft, mi) and to which unit they want to
 * convert (ml, l, g, kg, mm, cm, m, km). Reject incompatible conversions (such
 * as gal → km). Ask for the value to be converted, then display the result.
 * 
 * @bj.project P5.5
 */
public class UnitConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Convert from? ");
        String fromUnit = in.nextLine().toLowerCase();

        System.out.print("Convert to? ");
        String toUnit = in.nextLine().toLowerCase();

        System.out.print("Value? ");
        double value = in.nextDouble();

        double result = value;

        if (fromUnit.equals("fl. oz")) {
            if (toUnit.equals("ml")) {
                result *= 29.5735;
            } else if (toUnit.equals("l")) {
                result *= 0.0295735;
            } else {
                rejectIncompatible();
            }
        } else if (fromUnit.equals("gal")) {
            if (toUnit.equals("ml")) {
                result *= 3785.41;
            } else if (toUnit.equals("l")) {
                result *= 3.78541;
            } else {
                rejectIncompatible();
            }
        } else if (fromUnit.equals("oz")) {
            if (toUnit.equals("g")) {
                result *= 28.3495;
            } else if (toUnit.equals("kg")) {
                result *= 0.0283495;
            } else {
                rejectIncompatible();
            }
        } else if (fromUnit.equals("lb")) {
            if (toUnit.equals("g")) {
                result *= 453.592;
            } else if (toUnit.equals("kg")) {
                result *= 0.453592;
            } else {
                rejectIncompatible();
            }
        } else if (fromUnit.equals("in")) {
            if (toUnit.equals("mm")) {
                result *= 25.4;
            } else if (toUnit.equals("cm")) {
                result *= 2.54;
            } else if (toUnit.equals("m")) {
                result *= 0.0254;
            } else if (toUnit.equals("km")) {
                result *= 0.0000254;
            } else {
                rejectIncompatible();
            }
        } else if (fromUnit.equals("ft")) {
            if (toUnit.equals("mm")) {
                result *= 304.8;
            } else if (toUnit.equals("cm")) {
                result *= 30.48;
            } else if (toUnit.equals("m")) {
                result *= 0.3048;
            } else if (toUnit.equals("km")) {
                result *= 0.0003048;
            } else {
                rejectIncompatible();
            }
        } else if (fromUnit.equals("mi")) {
            if (toUnit.equals("mm")) {
                result *= 1_609_340;
            } else if (toUnit.equals("cm")) {
                result *= 160_934;
            } else if (toUnit.equals("m")) {
                result *= 1609.34;
            } else if (toUnit.equals("km")) {
                result *= 1.60934;
            } else {
                rejectIncompatible();
            }
        } else {
            rejectIncompatible();
        }

        System.out.printf("%.2f %s = %.2f %s%n", value, fromUnit, result, toUnit);

        in.close();
    }

    /**
     * Rejects incompatible units and exits the program.
     */
    public static void rejectIncompatible() {
        System.out.println("Incompatible units");
        System.exit(1);
    }
}