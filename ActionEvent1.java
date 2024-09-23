
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {

    Container c;
    JButton b1;

    public MyFrame() {
        // Set the container and layout
        c = this.getContentPane();
        c.setLayout(null);

        // Create the button
        b1 = new JButton("Click Me");
        b1.setBounds(100, 100, 100, 30);  // Set bounds for the button
        c.add(b1);  // Add the button to the container

        // Add action listener to the button
        b1.addActionListener(this);
    }

    // Override actionPerformed method for button click event
    @Override
    public void actionPerformed(ActionEvent e) {
        // Convert button text to uppercase
        String str = b1.getText();
        b1.setText(str.toUpperCase());
    }
}

public class ActionEvent1 {
    public static void main(String[] args) {
        // Create a frame object and set its properties
        MyFrame obj = new MyFrame();
        obj.setTitle("Action Event");
        obj.setBounds(100, 100, 400, 400);  // Set the frame's size and position
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set default close operation
        obj.setVisible(true);  // Make the frame visible
    }
}
