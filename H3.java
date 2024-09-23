import java.awt.*;
import javax.swing.*;

public class H3 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame f = new JFrame("MyDemo1");

        // Create a JMenuBar
        JMenuBar mb = new JMenuBar();
        
        // Create a menu
        JMenu menu = new JMenu("File");
        JMenuItem menuItem1 = new JMenuItem("Open");
        JMenuItem menuItem2 = new JMenuItem("Save");
        JMenuItem menuItem3 = new JMenuItem("Exit");

        // Add menu items to the menu
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);

        // Add the menu to the menu bar
        mb.add(menu);

        // Set the menu bar for the frame
        f.setJMenuBar(mb);

        // Create a JLabel with text, center alignment
        JLabel l = new JLabel("My Demo", SwingConstants.CENTER);

        // Set the font for the JLabel
        Font fo = new Font("Arial", Font.BOLD, 20);
        l.setFont(fo);

        // Add the label to the frame
        f.add(l, BorderLayout.CENTER);

        // Create a JButton
        JButton b1 = new JButton("Default");

        // Add the button to the frame
        f.add(b1, BorderLayout.SOUTH);

        // Make the button the default button
        f.getRootPane().setDefaultButton(b1);

        // Set frame size and visibility
        f.setSize(400, 200);
        f.setVisible(true);

        // Set default close operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

