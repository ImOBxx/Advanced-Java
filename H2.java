import java.awt.*;
import javax.swing.*;

public class H2 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame f = new JFrame("MyDemo2");

        // Create a JMenuBar
        JMenuBar mb = new JMenuBar();
        f.setJMenuBar(mb);  // Set the JMenuBar for the frame

        // Create a JLabel with text, center alignment
        JLabel l = new JLabel("My Demo", SwingConstants.CENTER);

        // Set the font for the JLabel
        Font fo = new Font("Arial", Font.BOLD, 20);
        l.setFont(fo);

        // Set layout manager for the frame
        f.setLayout(new BorderLayout());

        // Add the label to the center of the frame
        f.add(l, BorderLayout.CENTER);

        // Set frame size and visibility
        f.setSize(400, 200);
        f.setVisible(true);

        // Set default close operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
