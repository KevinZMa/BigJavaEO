import javax.swing.*;

public class DrawingViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingComponent component = new DrawingComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
