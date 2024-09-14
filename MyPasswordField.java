import java.awt.*;
import javax.swing.*;

public class MyPasswordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Change Password");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        
        // Get the content pane and set layout to null for absolute positioning
        Container c = frame.getContentPane();
        c.setLayout(null);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,50, 150, 30);
        c.add(pass);

        pass.setText("123456");
        pass.setFont(new Font("Arial", Font.PLAIN, 30));
        pass.setEchoChar('*');
        pass.setEchoChar((char)0);


        frame.setVisible(true);

    }
}
