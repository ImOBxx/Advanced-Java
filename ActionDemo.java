
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {

    Container c;
    JButton btn;

    MyFrame() {
        c = this.getContentPane();
        c.setLayout(null);

        btn = new JButton("Click Me");
        btn.setBounds(100, 100, 100, 50);
        c.add(btn);
        
        // Adding the action listener to the button
        btn.addActionListener(this);
    }

    // Implementing the actionPerformed method
    @Override
    public void actionPerformed(ActionEvent e) {
        c.setBackground(Color.YELLOW);
    }
}

public class ActionDemo {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Action Demo");
        f.setSize(700, 500);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
