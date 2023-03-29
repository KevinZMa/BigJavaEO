package ch06;

import java.util.Scanner;

/**
 * A class that prints prime numbers up to an inputted maximum.
 *
 * @bj.project P6.4
 */
public class PrimePrinter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Prime numbers up to: ");
        int num = in.nextInt();

        in.close();

        PrimeGenerator gen = new PrimeGenerator();
        int prime = gen.nextPrime();
        while (prime <= num) {
            System.out.println(prime);
            // note: this program keep checking for primes even after it has found all
            // primes up to num, sacrificing efficiency for simplicity
            prime = gen.nextPrime();
        }
    }
}
