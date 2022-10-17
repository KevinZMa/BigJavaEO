import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class DrawingComponent extends JComponent {

    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        Line2D.Double line1 = new Line2D.Double(0, 100, 200, 100);
        Line2D.Double line2 = new Line2D.Double(100, 0, 100, 200);
        Ellipse2D.Double circle1 = new Ellipse2D.Double(20, 20, 160, 160);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(40, 40, 120, 120);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(60, 60, 80, 80);

        g2.setColor(Color.RED);
        g2.fill(circle1);

        g2.setColor(Color.WHITE);
        g2.fill(circle2);

        g2.setColor(Color.RED);
        g2.fill(circle3);

        g2.draw(line1);
        g2.draw(line2);
    }
}
