package ch03.suburban_scene;

import javax.swing.*;

public class SuburbanSceneViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 100);
        frame.setTitle("Suburban Scene");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SuburbanSceneComponent component = new SuburbanSceneComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
