import javax.swing.*;

public class TargetViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TargetComponent component = new TargetComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
