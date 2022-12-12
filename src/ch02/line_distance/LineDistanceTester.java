package ch02.line_distance;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * P2.11 Write a program LineDistanceTester that constructs a line joining the
 * points (100, 100) and (200, 200), then constructs points (100, 200), (150,
 * 150), and (250, 50). Print the distance from the line to each of the three
 * points, using the ptSegDist method of the Line2D class. Also print the
 * expected values. (Draw a sketch on graph paper to find what values you
 * expect.)
 */
public class LineDistanceTester {

    public static void main(String[] args) {
        Point2D.Double p1 = new Point2D.Double(100, 100);
        Point2D.Double p2 = new Point2D.Double(200, 200);
        Line2D.Double line = new Line2D.Double(p1, p2);

        Point2D.Double p3 = new Point2D.Double(100, 200);
        System.out.println("Expected: 70.71067811865476");
        System.out.println(line.ptSegDist(p3));

        Point2D.Double p4 = new Point2D.Double(150, 150);
        System.out.println("Expected: 0.0");
        System.out.println(line.ptSegDist(p4));

        Point2D.Double p5 = new Point2D.Double(250, 50);
        System.out.println("Expected: 141.4213562373095");
        System.out.println(line.ptSegDist(p5));
    }
}
