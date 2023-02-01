package ch04;

import java.util.Scanner;

/**
 * Easter Sunday is the first Sunday after the first full moon of spring. To
 * compute the date, you can use the algorithm invented by the mathematician
 * Carl Friedrich Gauss in 1800 (see README). Write a program that prompts the
 * user for a year and prints out the month and day of Easter Sunday.
 * 
 * @bj.project P4.2
 */
public class EasterSunday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Year: ");
        int y = in.nextInt();

        in.close();

        int a = y % 19;
        
        int b = y / 100;
        int c = y % 100;

        int d = b / 4;
        int e = b % 4;

        int g = (8 * b + 13) / 25;

        int h = (19 * a + b - d - g + 15) % 30;

        int j = c / 4;
        int k = c % 4;

        int m = (a + 11 * h) / 319;

        int r = (2 * e + 2 * j - k - h + m + 32) % 7;

        int n = (h - m + r + 90) / 25;

        int p = (h - m + r + n + 19) % 32;

        System.out.println();
        System.out.printf("%d-%d%n", n, p);
    }
}
