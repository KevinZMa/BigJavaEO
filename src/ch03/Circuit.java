package ch03;

/**
 * Simulates a circuit for controlling a hallway light that has switches at both
 * ends of the hallway. Each switch can be up or down, and the light can be on
 * or off. Toggling either switch turns the lamp on or off.
 */
public class Circuit {

    int firstSwitch; // 0 for down, 1 for up
    int secondSwitch;
    int lamp; // 0 for off, 1 for on

    public int getFirstSwitchState() {
        return firstSwitch;
    }

    public int getSecondSwitchState() {
        return secondSwitch;
    }

    public int getLampState() {
        return lamp;
    }

    public void toggleFirstSwitch() {
        firstSwitch = 1 - firstSwitch;
        lamp = 1 - lamp;
    }

    public void toggleSecondSwitch() {
        secondSwitch = 1 - secondSwitch;
        lamp = 1 - lamp;
    }
}
