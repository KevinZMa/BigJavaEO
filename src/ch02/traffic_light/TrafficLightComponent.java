package ch02.traffic_light;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

/**
 * P2.15 Write a graphical program that draws a traffic light.
 */
public class TrafficLightComponent extends JComponent {

    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        Rectangle sky = new Rectangle(10, 10, 80, 210);
        g2.setColor(Color.BLACK);
        g2.fill(sky);

        Ellipse2D.Double red = new Ellipse2D.Double(25, 25, 50, 50);
        g2.setColor(Color.RED);
        g2.fill(red);

        Ellipse2D.Double yellow = new Ellipse2D.Double(25, 90, 50, 50);
        g2.setColor(Color.YELLOW);
        g2.fill(yellow);

        Ellipse2D.Double green = new Ellipse2D.Double(25, 155, 50, 50);
        g2.setColor(Color.GREEN);
        g2.fill(green);
    }
}
