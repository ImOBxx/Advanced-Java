import java.awt.Color;
import java.awt.Container;
import javax.swing.*;

public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Java Swing Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        frame.setTitle("My Frame");

        ImageIcon icon = new ImageIcon("gratis-png-dos-carpetas-grises-rectangulo-carpetas-carpetas-negras-thumbnail.png");
        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
        c.setBackground(Color.RED);

        frame.setVisible(true);  // Set visibility after adding components

        frame.setResizable(false);
    }
}
