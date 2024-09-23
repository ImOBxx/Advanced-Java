import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {

    Container c;
    JTextField t1;

    public MyFrame() {
        // Set the container and layout
        c = this.getContentPane();
        c.setLayout(null);

        // Create the button
        t1 = new JTextField();
        t1.setBounds(100, 100, 100, 30);  // Set bounds for the button
        c.add(t1);  // Add the button to the container

        t1.setFont(new Font("Arial", Font.BOLD, 15));

        // Add action listener to the button
        t1.addActionListener(this);
    }

    // Override actionPerformed method for button click event
    @Override
    public void actionPerformed(ActionEvent e) {
        // Convert button text to uppercase
        String str = t1.getText();
        t1.setText(str.toUpperCase());
    }
}

public class ActionEvent2 {
    public static void main(String[] args) {
        // Create a frame object and set its properties
        MyFrame obj = new MyFrame();
        obj.setTitle("Action Event");
        obj.setBounds(100, 100, 400, 400);  // Set the frame's size and position
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set default close operation
        obj.setVisible(true);  // Make the frame visible
    }
}
