package ch03.suburban_scene;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws two traffic light shapes.
 */
public class TrafficLightComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        TrafficLight trafficLight1 = new TrafficLight(0, 0);
        TrafficLight trafficLight2 = new TrafficLight(100, 100);
        trafficLight1.draw(g2);
        trafficLight2.draw(g2);
    }
}
