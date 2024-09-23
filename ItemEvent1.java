import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends JFrame implements ItemListener {
    
    JComboBox jcb;
    JTextArea ta;

    public MyFrame() {
         Container c = getContentPane();
         c.setLayout(null);

         String[] values = {"A", "B", "C", "D"};

         jcb = new JComboBox(values);
         jcb.setBounds(50, 50, 100, 30);
         c.add(jcb);

         jcb.addItemListener(this);

         ta = new JTextArea();
         ta.setBounds(200, 50, 100, 100);
         c.add(ta);
        
        }
        @Override
        public void itemStateChanged (ItemEvent e) {
            
            String str = jcb.getSelectedItem().toString();
            ta.setText(str);
        }
}

public class ItemEvent1 {
    public static void main(String[] args) {

        MyFrame f = new MyFrame();
        f.setTitle("Item Event1");
        f.setBounds(100, 100, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    
    }
}
