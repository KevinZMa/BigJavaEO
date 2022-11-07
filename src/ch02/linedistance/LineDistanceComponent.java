package ch02.linedistance;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JComponent;

/**
 * P2.12 Repeat Testing P2.11, but now write a graphical application that shows the
 * line and the points. Draw each point as a tiny circle.
 */
public class LineDistanceComponent extends JComponent {

    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        float[][] testPoints = { { 100, 200 }, { 150, 150 }, { 250, 50 } };

        Line2D line = new Line2D.Double(100, 100, 200, 200);
        g2.draw(line);

        for (float[] p : testPoints) {
            printDistance(g2, line, p[0], p[1]);
        }
    }

    private void printDistance(Graphics2D g2, Line2D line, float x, float y) {
        Point2D p = new Point2D.Float(x, y);

        Ellipse2D dot = new Ellipse2D.Double(x - 2, y - 2, 4, 4);
        g2.draw(dot);

        Double dist = line.ptSegDist(p);
        g2.drawString("Distance: " + round(dist), x + 5, y);
    }

    /**
     * Round a double to two decimal places.
     *
     * @param d The double to round.
     * @return The rounded result.
     */
    private double round(double d) {
        return Math.round(d * 100.0) / 100.0;
    }
}
