import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyDialog2 {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame f = new JFrame("Message Types Demo");
        f.setSize(700, 500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));  // Add some spacing between buttons

        // Create and add the Plain Message button
        JButton button1 = new JButton("Plain");
        f.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello There, This is A Plain Message", "Message", JOptionPane.PLAIN_MESSAGE);
            }
        });

        // Create and add the Information Message button
        JButton button2 = new JButton("Information");
        f.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello There, This is An Information Message", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Create and add the Question Message button
        JButton button3 = new JButton("Question");
        f.add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello There, This is A Question Message", "Question", JOptionPane.QUESTION_MESSAGE);
            }
        });

        // Create and add the Error Message button
        JButton button4 = new JButton("Error");
        f.add(button4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello There, This is An Error Message", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Create and add the Warning Message button
        JButton button5 = new JButton("Warning");
        f.add(button5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello There, This is A Warning Message", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Set the frame to be visible after adding components
        f.setVisible(true);
    }
}
    