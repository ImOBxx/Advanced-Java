import javax.swing.*;  
import java.awt.event.*;  // Import the ActionListener package

public class InsideConstructor {  
    JFrame f;  // Declare the JFrame instance

    InsideConstructor() {  
        f = new JFrame("My GUI Application"); // Create the JFrame instance with a title

        JButton b = new JButton("Click Me"); // Create the JButton instance with a label
        b.setBounds(130, 100, 100, 40); // Set the position and size of the button

        // Add an ActionListener to the button to perform an action when clicked
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Button Clicked!"); // Show a message dialog
            }
        });

        f.add(b); // Add the button to the JFrame

        f.setSize(400, 500); // Set the size of the JFrame
        f.setLayout(null); // Use no layout manager (absolute positioning)
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the window is closed
        f.setVisible(true); // Make the frame visible
    }  

    public static void main(String[] args) {  
        new InsideConstructor(); // Create an instance of the class, invoking the constructor
    }  
}  
