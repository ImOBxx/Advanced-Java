import java.awt.*;
import javax.swing.*;

public class NullLayoutExample {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame f = new JFrame("Null Layout");
        f.setBounds(300, 200, 600, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null); // Set layout to null to allow absolute positioning
        f.setVisible(true);
        f.setResizable(false);

        // Get the content pane
        Container c = f.getContentPane();

        // Create buttons
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");

        // Set bounds for buttons (x, y, width, height)
        b1.setBounds(20, 20, 80, 30);  // Adjusted width for better appearance
        b2.setBounds(120, 20, 80, 30);
        b3.setBounds(220, 20, 80, 30);
        b4.setBounds(20, 100, 80, 30);
        b5.setBounds(120, 100, 80, 30);

        // Add buttons to the container
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
    }
}
