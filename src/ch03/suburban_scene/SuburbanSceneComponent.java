package ch03.suburban_scene;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * The component draws a suburban scene with cars and traffic lights.
 */
public class SuburbanSceneComponent extends JComponent {
    private final String[] OBJECT_PLACEMENTS = {"CAR", "CAR", "LIGHT", "LIGHT", "CAR"};

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        int xCoord = 0;

        for (String obj : OBJECT_PLACEMENTS) {
            if (obj.equalsIgnoreCase("CAR")) {
                new Car(xCoord, 0).draw(g2);
            } else if (obj.equalsIgnoreCase("LIGHT")) {
                new TrafficLight(xCoord, 0, 20).draw(g2);
            } else {
                throw new IllegalArgumentException("Object must be one of {\"CAR\", \"LIGHT\"}, got " + obj);
            }

            xCoord += 100; // each object is spaced apart by 100 pixels
        }
    }
}
