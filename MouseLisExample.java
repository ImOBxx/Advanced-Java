
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

class MyFrame extends JFrame implements MouseListener {

    JLabel l;
    JTextArea ta;

    // Constructor accepting title
    public MyFrame(String title) {
        // Set the title of the frame
        super(title);

        Container c = getContentPane();
        c.setLayout(null);

        // Create and configure the label
        l = new JLabel("My Label"); 
        l.setFont(new Font("Arial", Font.BOLD, 18));  // Corrected the Font.BOLD constant
        l.setBounds(50, 100, 100, 30);
        c.add(l);
        l.addMouseListener(this);

        // Create and configure the text area
        ta = new JTextArea();
        ta.setBounds(200, 50, 300, 300);
        c.add(ta);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ta.setText(ta.getText() + "\n" + "Mouse Is Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText() + "\n" + "Mouse Is Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText() + "\n" + "Mouse Is Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ta.setText(ta.getText() + "\n" + "Mouse Is Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        ta.setText(ta.getText() + "\n" + "Mouse Is Exited");
    }
}

public class MouseLisExample {
    public static void main(String[] args) {
        // Create a new frame with a title
        MyFrame f = new MyFrame("Mouse Events");
        f.setBounds(100, 100, 700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
