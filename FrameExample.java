
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class FrameExample {
    JFrame myFrame;
    JDialog dialog;
    JPanel panel, panel2, homePanel, aboutPanel, contactPanel;
    JTabbedPane tabbedPane;
    JMenuBar menubar;
    JMenu fileMenu, editMenu, exitMenu;
    JMenuItem fileNewMenuItem, fileOpenMenuItem, fileSaveMenuItem;

    public FrameExample() {
        myFrame = new JFrame();
        dialog = new JDialog(myFrame, true);
        panel = new JPanel();
        panel2 = new JPanel(new BorderLayout()); // Use BorderLayout for panel2

        // Initialize panels
        homePanel = new JPanel();
        aboutPanel = new JPanel();
        contactPanel = new JPanel();

        tabbedPane = new JTabbedPane(JTabbedPane.LEFT);

        menubar = new JMenuBar();
        fileMenu = new JMenu("FILE");
        editMenu = new JMenu("EDIT");
        exitMenu = new JMenu("EXIT");

        fileNewMenuItem = new JMenuItem("New");
        fileOpenMenuItem = new JMenuItem("Open");
        fileSaveMenuItem = new JMenuItem("Save");

        fileMenu.add(fileNewMenuItem);
        fileMenu.add(fileOpenMenuItem);
        fileMenu.add(fileSaveMenuItem);

        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(exitMenu);

        // Set background colors for panels
        homePanel.setBackground(Color.GREEN);
        aboutPanel.setBackground(new Color(4, 118, 208));
        contactPanel.setBackground(Color.RED);

        // Add panels to the tabbed pane
        tabbedPane.addTab("Home", homePanel);
        tabbedPane.addTab("About", aboutPanel);
        tabbedPane.addTab("Contact", contactPanel);

        panel.setBackground(Color.RED);
        dialog.setTitle("My Dialog");
        dialog.setSize(200, 200);
        dialog.add(panel);

        myFrame.setTitle("My App");
        myFrame.setSize(400, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the tabbed pane to panel2 with BorderLayout.CENTER
        panel2.add(tabbedPane, BorderLayout.CENTER);

        // Add panel2 to the frame
        myFrame.add(panel2);

        // Set the menu bar to the frame
        myFrame.setJMenuBar(menubar);

        myFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FrameExample());
    }
}
