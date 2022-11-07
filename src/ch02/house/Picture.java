package ch02.house;

/**
 * This class represents a simple picture containing two houses.
 */
public class Picture {

    /**
     * Draw this picture.
     */
    public static void main(String[] args) {
        House h1 = new House();
        House h2 = new House();
        h1.draw(100, 0);
        h2.draw(-100, 0);
    }
}
