
import javax.swing.*;


public class JLabels {

    public static void main(String[] args) {
        JFrame f = new JFrame("Label Example");
        JLabel l1, l2, l3;
        l1 = new JLabel("First Label");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Second Label");
        l2.setBounds(50, 100, 100, 30);
        l3 = new JLabel("Third Label");
        l3.setBounds(50, 150, 100, 30);  // Increase Y for Alignment
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }
    
}
