

import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 400);
        f.setTitle("Box Layout Example");
        Container c = f.getContentPane();

        BoxLayout bl = new BoxLayout(c, BoxLayout.Y_AXIS);

        c.setLayout(bl);

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2 --");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4 --------");

        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        c.add(b1);
        c.add(Box.createRigidArea(new Dimension(0, 80)));
        c.add(b2);
        c.add(b3);
        c.add(b4);
        
    }
}
