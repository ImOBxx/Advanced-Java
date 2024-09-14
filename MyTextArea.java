
import java.awt.*;
import javax.swing.*;

public class MyTextArea {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Text Area");
        f.setBounds(100, 100, 700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        JTextArea ta  = new JTextArea();
        ta.setBounds(100, 100, 400, 200);
        c.add(ta);

        ta.setText("This Is The Text Area");

        ta.setFont(new Font("Arial", Font.BOLD, 15));

        ta.setLineWrap(true);

        ta.setEditable(true);
        
        f.setVisible(true);
    }
}
