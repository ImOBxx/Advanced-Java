import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyComboBox {
    public static void main(String[] args) {
        JFrame f = new JFrame("My ComboBox");
        f.setSize(700, 500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(null);

        String[] values = {
             "A", "B", "C", "D"
        };

        JComboBox c1 = new JComboBox(values);
        c1.setBounds(100, 100, 100, 30);
        c.add(c1);

        c1.setEditable(true);

        c1.setSelectedItem("NA");

        c1.setSelectedIndex(0);

        c1.setFont(new Font("Arial", Font.BOLD, 10));

        JButton button = new JButton("OK");
        button.setBounds(100, 150, 100, 30);  // Adjusted position
        c.add(button);

        JLabel label = new JLabel("");
        label.setBounds(100, 200, 100, 30);  // Adjusted position
        c.add(label);

        c1.addItem("E");
        c1.removeItem("C");  // Removes First

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            String item = (String)c1.getSelectedItem();
            label.setText(item);

            }
        });
        
        f.setVisible(true);
    }
}
