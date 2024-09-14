
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 400);
        
        Container c = frame.getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 300, 300);
        panel.setBackground(Color.YELLOW);
        c.add(panel);

        JPanel panel2 = new JPanel();
        panel2.setBounds(300, 0, 200, 200);
        panel2.setBackground(Color.BLUE);
        c.add(panel2);
    }
}
