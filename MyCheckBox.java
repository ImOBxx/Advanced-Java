import java.awt.*;
import javax.swing.*;

public class MyCheckBox {
    public static void main(String[] args) {
         JFrame f = new JFrame("Check Box");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 500);
        
        Container c = f.getContentPane();
        c.setLayout(null);

        JCheckBox c1 = new JCheckBox("High School");
        JCheckBox c2 = new JCheckBox("Intermediate");
        JCheckBox c3 = new JCheckBox("Under Graduate");
        JCheckBox c4 = new JCheckBox("Graduate");

        c1.setBounds(100, 50, 200, 20);
        c2.setBounds(100, 100, 200, 20);
        c3.setBounds(100, 150, 200, 20);
        c4.setBounds(100, 200, 200, 20);
        
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.setSelected(true);

        c4.setEnabled(false);

        Font font = new Font("Constantia", Font.ITALIC, 20);
        c1.setFont(font);
        c2.setFont(font);
        c3.setFont(font);
        c4.setFont(font);


        f.setVisible(true);
        
    }
}
