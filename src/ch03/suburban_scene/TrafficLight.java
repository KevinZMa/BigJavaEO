package ch03.suburban_scene;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class TrafficLight {

    private int xLeft;
    private int yTop;
    private int width = 50;

    public TrafficLight(int x, int y) {
        xLeft = x;
        yTop = y;
    }

    public TrafficLight(int x, int y, int width) {
        xLeft = x;
        yTop = y;
        this.width = width;
    }

    public void draw(Graphics2D g2) {
        int gap = width / 10;
        int circleSize = width - 2 * gap;

        Rectangle box = new Rectangle(xLeft, yTop, width, 3 * width);
        g2.setColor(Color.BLACK);
        g2.fill(box);

        Ellipse2D.Double top = new Ellipse2D.Double(
            xLeft + gap,
            yTop + gap,
            circleSize,
            circleSize
        );
        g2.setColor(Color.RED);
        g2.fill(top);

        Ellipse2D.Double middle = new Ellipse2D.Double(
            xLeft + gap,
            yTop + width + gap,
            circleSize,
            circleSize
        );
        g2.setColor(Color.YELLOW);
        g2.fill(middle);

        Ellipse2D.Double bottom = new Ellipse2D.Double(
            xLeft + gap,
            yTop + width * 2 + gap,
            circleSize,
            circleSize
        );
        g2.setColor(Color.GREEN);
        g2.fill(bottom);
    }
}
