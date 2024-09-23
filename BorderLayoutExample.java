import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame f = new JFrame("Border Layout");
        f.setBounds(300, 200, 600, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout(10, 5)); // Set the layout to BorderLayout
        
        // Create buttons
        JButton b1 = new JButton("PAGE_START");
        JButton b2 = new JButton("PAGE_END");
        JButton b3 = new JButton("LINE_START");
        JButton b4 = new JButton("CENTER");
        JButton b5 = new JButton("LINE_END");
        
        
        // Add buttons to the BorderLayout regions
        f.add(b1, BorderLayout.PAGE_START);   // Top
        f.add(b2, BorderLayout.PAGE_END);     // Bottom
        f.add(b3, BorderLayout.LINE_START);   // Left
        f.add(b4, BorderLayout.CENTER);       // Center
        f.add(b5, BorderLayout.LINE_END);     // Right
        

     

        // Make the frame visible after adding components
        f.setVisible(true);
    }
}
