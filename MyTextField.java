import java.awt.*;
import javax.swing.*;

public class MyTextField {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Text Field Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);

        // Get the content pane and set the layout to null for absolute positioning
        Container c = frame.getContentPane();
        c.setLayout(null);

        // Create and configure the JTextField
        JTextField t1 = new JTextField();
        t1.setBounds(100, 50, 250, 30);  // Increased width for better visibility
        c.add(t1);  // Add the JTextField to the content pane

        t1.setText("Abhishek Banerjee");
        Font font = new Font("Arial", Font.BOLD, 25);
        t1.setFont(font);

        t1.setForeground(Color.GREEN);
        t1.setBackground(Color.BLACK);

        t1.setEditable(false);
        
        frame.setVisible(true);
    }
}
