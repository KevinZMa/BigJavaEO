package ch06;

/**
 * A class that generates prime numbers.
 */
public class PrimeGenerator {

    private int num = 1;

    public int nextPrime() {
        do {
            num++;
        } while (!isPrime());
        return num;
    }

    public boolean isPrime() {
        // check divisibility for all numbers up to sqrt(num)
        double sqrt = Math.sqrt(num); // if num is not prime, it has a factor <= sqrt(num)
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
