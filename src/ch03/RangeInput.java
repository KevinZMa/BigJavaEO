package ch03;

/**
 * E3.3 A class allowing users to select a value within a range of values by
 * incrementing or decrementing by 1.
 */
public class RangeInput {

    private int min;
    private int max;
    private int value;

    public RangeInput(int min, int max) {
        this.min = min;
        this.max = max;
        value = (max + min) / 2;
    }

    public void up() {
        value = Math.min(value + 1, max);
    }

    public void down() {
        value = Math.max(value - 1, min);
    }

    public int getValue() {
        return value;
    }
}
