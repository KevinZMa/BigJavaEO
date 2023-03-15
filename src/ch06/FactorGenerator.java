package ch06;

/**
 * A class that generates prime factors for a number.
 */
public class FactorGenerator {

    private int num;

    public FactorGenerator(int numberToFactor) {
        num = numberToFactor;
    }

    public int nextFactor() {
        int factor = 2;
        while (num % factor != 0) {
            factor++;
        }
        num /= factor;
        return factor;
    }

    public boolean hasMoreFactors() {
        return num > 1;
    }
}
