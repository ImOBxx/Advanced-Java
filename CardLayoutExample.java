import java.awt.*;
import javax.swing.*;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Card Layout Example");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 400);
        Container c = f.getContentPane();

        CardLayout cl = new CardLayout();
        c.setLayout(cl);

        JButton b1 = new JButton("Page 1");
        JButton b2 = new JButton("Page 2");
        JButton b3 = new JButton("Page 3");
        JButton b4 = new JButton("Page 4");
        JButton b5 = new JButton("Page 5");

        c.add(b1, "1");
        c.add(b2, "2");
        c.add(b3, "3");
        c.add(b4, "4");
        c.add(b5, "5");

        cl.next(c);
        cl.previous(c);
        cl.first(c);
        cl.last(c);

        cl.show(c,"3");
    }
}
