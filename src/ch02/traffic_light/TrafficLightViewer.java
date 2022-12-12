package ch02.trafficlight;

import javax.swing.*;

public class TrafficLightViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(100, 260);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TrafficLightComponent component = new TrafficLightComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
