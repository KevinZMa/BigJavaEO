package ch03.suburban_scene;

import javax.swing.*;

public class TrafficLightViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Two traffic lights");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TrafficLightComponent component = new TrafficLightComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
