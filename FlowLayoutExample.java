import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Flow Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        // Get the content pane and set its layout to FlowLayout
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEADING)); // Center alignment with gaps
        
        // Create and add buttons
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        
        container.add(btn1);
        container.add(btn2);
        container.add(btn3);
        container.add(btn4);
        container.add(btn5);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
