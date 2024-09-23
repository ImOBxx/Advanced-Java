
import java.awt.*;
import javax.swing.*;

public class JScrollPaneDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("JScroll Pane Demo");
        f.setLayout(new FlowLayout());

        JTextArea ta = new JTextArea(10, 15);

        // Create JScrollPane with just the JTextArea
        JScrollPane sp = new JScrollPane(ta);
        
        // Set scroll bar policies separately
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        f.add(sp);

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
