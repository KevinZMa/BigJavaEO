package ch02.line_distance;

import javax.swing.*;

public class LineDistanceViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(450, 300);
        frame.setTitle("Line and Distances from Points");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LineDistanceComponent component = new LineDistanceComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
