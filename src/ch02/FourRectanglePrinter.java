import java.awt.Rectangle;

/**
 * P2.1
 */
public class FourRectanglePrinter {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(0, 0, 50, 100);
        System.out.println(box);
        box.translate(50, 0);
        System.out.println(box);
        box.translate(0, 100);
        System.out.println(box);
        box.translate(-50, 0);
        System.out.println(box);
    }
}
