import java.awt.*;
import javax.swing.*;

public class MyButton {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Change Password");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        
        // Get the content pane and set layout to null for absolute positioning
        Container c = frame.getContentPane();
        c.setLayout(null);
        
        ImageIcon icon = new ImageIcon("gratis-png-dos-carpetas-grises-rectangulo-carpetas-carpetas-negras-thumbnail.png");
        JButton btn = new JButton("Click Me");
        btn.setSize(icon.getIconHeight(), icon.getIconWidth());
        btn.setLocation(100, 100);
        c.add(btn);


        Font font = new Font("Arial", Font.PLAIN, 20);
        btn.setFont(font);

        btn.setForeground(Color.RED);
        btn.setBackground(Color.YELLOW);
         
        Cursor cur = new Cursor(Cursor.WAIT_CURSOR);
        btn.setCursor(cur);

        btn.setEnabled(false);
        btn.setVisible(true);


        btn.setText("My Button");
        frame.setVisible(true);

        
}
}
