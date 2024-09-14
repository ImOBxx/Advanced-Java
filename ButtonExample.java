import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame f = new JFrame("Button Example");
        
        // Create a new JButton with the label "Click Here"
        JButton b = new JButton("Click Here");
        
        // Set the button's position and size
        b.setBounds(50, 100, 95, 30);
        
        // Add the button to the frame
        f.add(b);
        
        // Set the frame size
        f.setSize(400, 400);
        
        // Set the layout to null for absolute positioning
        f.setLayout(null);
        
        // Make the frame visible
        f.setVisible(true);
        
        // Specify the close operation for the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


