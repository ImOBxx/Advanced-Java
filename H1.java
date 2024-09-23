import java.awt.*;
import javax.swing.*;

public class H1 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame f = new JFrame("MyDemo1");

        // Create a JLabel with text, center alignment
        JLabel l = new JLabel("My Demo", SwingConstants.CENTER);

        // Set the font for the JLabel
        Font fo = new Font("Arial", Font.BOLD, 20);
        l.setFont(fo);

        // Add the label to the frame
        f.add(l);

        // Set frame size and visibility
        f.setSize(400, 200);
        f.setVisible(true);

        // Set default close operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

