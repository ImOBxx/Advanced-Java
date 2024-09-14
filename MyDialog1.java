
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDialog1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("My ComboBox");
        f.setSize(700, 500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me");
        f.add(button);

        f.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter Your Name: ");
                if (str != null && str.length() > 0) {
                    System.out.println("The Name Of The User Is: " + str);
                }
            }
        });
    }
}

