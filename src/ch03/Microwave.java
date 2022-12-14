package ch03;

/**
 * P3.5 Simulate a microwave with 4 buttons: adding 30 seconds, switching power
 * levels, resetting, and starting.
 */
public class Microwave {

    private int time;
    private int powerLevel = 1;

    /**
     * Increase the time by 30 seconds.
     */
    public void addTime() {
        time += 30;
    }

    /**
     * Switch between power levels 1 and 2.
     */
    public void switchLevel() {
        if (powerLevel == 1) {
            powerLevel = 2;
        } else {
            powerLevel = 1;
        }
    }

    public void reset() {
        time = 0;
        powerLevel = 1;
    }

    /**
     * Start the microwave.
     */
    public void start() {
        System.out.printf(
            "Cooking for %d seconds at level %d%n",
            time,
            powerLevel
        );
    }

    /*
     * Unit Testing
     */
    public static void main(String[] args) {
        Microwave mw = new Microwave();
        mw.addTime();
        mw.addTime();
        mw.switchLevel();
        mw.start();
        System.out.println("Expected: Cooking for 60 seconds at level 2");
    }
}
