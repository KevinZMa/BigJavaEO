package ch02.moon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

/**
 * 2.10 SC 4: Draws a moon in the night sky.
 */
public class MoonComponent extends JComponent {

    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        Rectangle sky = new Rectangle(0, 0, 200, 200);
        g2.setColor(Color.BLACK);
        g2.fill(sky);

        Ellipse2D.Double biggerCircle = new Ellipse2D.Double(50, 50, 100, 100);
        g2.setColor(Color.YELLOW);
        g2.fill(biggerCircle);

        Ellipse2D.Double smallerCircle = new Ellipse2D.Double(70, 55, 90, 90);
        g2.setColor(Color.BLACK);
        g2.fill(smallerCircle);
    }
}
