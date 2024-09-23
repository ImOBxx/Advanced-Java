
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

class MyFrame extends JFrame implements KeyListener{
    JTextArea ta;

    public MyFrame(String title) {
        // Call the parent constructor to set the window title
        super(title);

        // Set the layout and add the text area
        Container c = getContentPane();
        c.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(10, 10, 370, 330);

        // Add the text area to the container
        c.add(ta);
        ta.addKeyListener(this);
    
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Key is Typed : "+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Key is Pressed : "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Key is Released : "+e.getKeyChar());
    }
}

public class KeyEvent1 {
    public static void main(String[] args) {
        // Create an instance of MyFrame with the title "Key Event Demo"
        MyFrame f = new MyFrame("Key Event Demo");
        f.setBounds(100, 100, 400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
