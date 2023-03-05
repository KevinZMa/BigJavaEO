package ch06;

import java.util.Scanner;

/**
 * Write programs with loops that compute
 *
 * The sum of all even numbers between 2 and 100 (inclusive).
 * The sum of all squares between 1 and 100 (inclusive).
 * All powers of 2 from 2^0 up to 2^20.
 * The sum of all odd numbers between a and b (inclusive), where a and b are
 * inputs.
 * The sum of all odd digits of an input. (For example, if the input is 32677,
 * the sum would be 3 + 7 + 7 = 17.)
 *
 * @bj.exercise E6.1
 */
public class Sums {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 0; i <= 20; i++) {
            sum += Math.pow(2, i);
        }
        System.out.println(sum);

        Scanner in = new Scanner(System.in);

        System.out.print("Input a and b: ");
        int a = in.nextInt();
        int b = in.nextInt();

        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }

        sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.print("Input number: ");
        int num = in.nextInt();

        in.close();

        sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
