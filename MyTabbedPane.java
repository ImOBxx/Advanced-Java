
import javax.swing.*;

public class MyTabbedPane {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTabbed Pane Demo");
        f.setLayout(null);

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 250, 250);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.add(new JLabel("This is my First Page"));
        p2.add(new JLabel("This is my Second Page"));
        p3.add(new JLabel("This is my Third Page"));

        tp.add("First", p1);
        tp.add("Second", p2);
        tp.add("Third", p3);



        f.add(tp);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
