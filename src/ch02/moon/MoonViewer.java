import javax.swing.*;

public class MoonViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MoonComponent component = new MoonComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
