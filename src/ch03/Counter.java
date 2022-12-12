package ch03;

/**
 * This class models a tally counter.
 */
public class Counter {
    private int value;
    private int clickLimit;

    /**
     * Gets the current value of this counter.
     * 
     * @return the current value
     */
    public int getValue() {
        return value;
    }

    /**
     * E3.2 Simulate a tally counter that can be used to admit a limited number of
     * people. If the click button is clicked more often than the limit, it has no
     * effect.
     */
    public void setLimit(int limit) {
        clickLimit = limit;
    }

    /**
     * Advances the value of this counter by 1.
     */
    public void click() {
        if (value < clickLimit) {
            value++;
        }
    }

    /**
     * E3.1 Add a button to the tally counter in Section 3.1 that allows an operator
     * to undo an accidental button click. As an added precaution, make sure that
     * clicking the undo button more often than the click button has no effect.
     */
    public void undo() {
        if (value > 0) {
            value--;
        }
    }

    /**
     * Resets the value of this counter to 0.
     */
    public void reset() {
        value = 0;
    }
}
