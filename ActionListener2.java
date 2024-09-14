import java.awt.event.*;
import javax.swing.*;

public class ActionListener2 extends JFrame implements ActionListener {
    JTextField tf;
    JLabel l;
    JButton b;

    ActionListener2() {
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        l = new JLabel();
        l.setBounds(50, 100, 250, 20); // increased width to fit longer IP addresses
        b = new JButton("Find IP");
        b.setBounds(50, 150, 95, 30);
        b.addActionListener(this);
        
        // Add components to the frame
        add(tf);
        add(l);
        add(b);
        
        // Frame settings
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrected position
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is: " + ip); // Added space after "IP of"
        } catch (Exception ex) {
            l.setText("Error: " + ex.getMessage()); // Show error in label instead of console
        }
    }

    public static void main(String[] args) {
        new ActionListener2();
    }
}

