
import java.awt.*;
import javax.swing.*;

public class MyLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Change Password");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        
        // Get the content pane and set layout to null for absolute positioning
        Container c = frame.getContentPane();
        c.setLayout(null);

        // Create the "Username" label
        JLabel label = new JLabel("Username: ");
        label.setBounds(100, 50, 200, 30);
        Font font = new Font("Arial", Font.BOLD, 30);
        label.setFont(font);
        c.add(label); // Add the first label to the content pane

        // Create the "Password" label
        JLabel label1 = new JLabel("Password: ");
        label1.setBounds(100, 150, 200, 30);
        label1.setFont(font);
        c.add(label1); // Add the second label to the content pane

        // Create an icon label
        ImageIcon icon = new ImageIcon("gratis-png-dos-carpetas-grises-rectangulo-carpetas-carpetas-negras-thumbnail.png");
        JLabel label2 = new JLabel(icon);
        label2.setBounds(500, 50, icon.getIconWidth(), icon.getIconHeight());
        c.add(label2); // Add the icon label to the content pane

        // Create a label with text and icon
        JLabel label3 = new JLabel("Text", icon, JLabel.LEFT);
        label3.setBounds(500, 200, 200, 100); // Set bounds with correct dimensions
        c.add(label3); // Add the text-and-icon label to the content pane

        // Make the frame visible after adding all components
        frame.setVisible(true);
    }
}
