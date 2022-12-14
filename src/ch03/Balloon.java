package ch03;

/**
 * P3.3 Simulates a ballon with a radius.
 */
public class Balloon {

    private int radius;

    public void inflate(double amount) {
        radius += amount;
    }

    public double getVolume() {
        System.out.println(Math.PI);
        System.out.println(Math.pow(radius, 3));
        return (4.0 / 3.0) * Math.pow(radius, 3) * Math.PI;
    }

    /**
     * Unit Testing
     */
    public static void main(String[] args) {
        Balloon balloon = new Balloon();
        System.out.println(balloon.getVolume());
        System.out.println("Expected: 0.0");

        balloon.inflate(5.0);
        System.out.println(balloon.getVolume());
        System.out.println("Expected: 523.5987755982989");
    }
}
