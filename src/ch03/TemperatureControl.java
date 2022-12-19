package ch03;

/**
 * E3.3 Simulates clicks on controls for the passenger and driver seats.
 */
public class TemperatureControl {
    private RangeInput driver;
    private RangeInput passenger;

    public TemperatureControl() {
        driver = new RangeInput(60, 80);
        passenger = new RangeInput(60, 80);
    }

    public int getDriver() {
        return driver.getValue();
    }

    public void driverUp() {
        driver.up();
    }

    public void driverDown() {
        driver.down();
    }

    public int getPassenger() {
        return passenger.getValue();
    }

    public void passengerUp() {
        passenger.up();
    }

    public void passengerDown() {
        passenger.down();
    }

    public static void main(String[] args) {
        TemperatureControl temp = new TemperatureControl();
        
        temp.driverUp();
        temp.driverUp();
        temp.driverUp();
        temp.driverUp();
        temp.driverDown();
        
        System.out.println(temp.getDriver());
        System.out.println("Expected: 73");

        temp.passengerUp();
        temp.passengerUp();
        temp.passengerDown();
        temp.passengerDown();
        temp.passengerDown();
        temp.passengerDown();
        temp.passengerDown();

        System.out.println(temp.getPassenger());
        System.out.println("Expected: 67");
    }
}
