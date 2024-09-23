
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagExample extends JFrame {

    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Button 4");
    JButton b5 = new JButton("Button 5");

    public GridBagExample() {
        setTitle("GridBag Layout Example");
        setBounds(100, 200, 500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        GridBagLayout g = new GridBagLayout();
        c.setLayout(g);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5; // Request for extra horizontal space

        // Add Button 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        c.add(b1, gbc);

        // Add Button 2
        gbc.gridx = 1;
        gbc.gridy = 0;
        c.add(b2, gbc);

        // Add Button 3
        gbc.gridx = 2;
        gbc.gridy = 0;
        c.add(b3, gbc);

        // Button 4 spans across all three columns
        gbc.gridwidth = 3; // Span across 3 columns
        gbc.gridheight = 1; // Span 1 row
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 40; // Increase internal padding (height)
        c.add(b4, gbc);

        // Reset constraints for Button 5
        gbc.gridwidth = 2; // Span across 2 columns
        gbc.gridx = 1; // Align it properly under Button 4
        gbc.gridy = 2;
        gbc.anchor=GridBagConstraints.PAGE_END;
        gbc.weighty= 1;
        gbc.ipady = 0; // Padding for height
        c.add(b5, gbc);

        pack(); // Automatically size the window

        setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagExample();
    }
}
