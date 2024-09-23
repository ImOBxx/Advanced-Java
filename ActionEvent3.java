import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file, edit;
    JMenuItem i1, i2, i3, i4, i5, i6, i7;
    JTextArea ta;

    public MyFrame() {
        // Set the container and layout
        Container c = getContentPane();
        c.setLayout(null);

        // Create the menu bar
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");

        // Create menu items
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        i6 = new JMenuItem("Paste");
        i7 = new JMenuItem("Select All");

        // Add action listener for "New"
        i1.addActionListener(this);
        i2.addActionListener(this);  // For Open
        i3.addActionListener(this);  // For Save
        i4.addActionListener(this);  // For Cut
        i5.addActionListener(this);  // For Copy
        i6.addActionListener(this);  // For Paste
        i7.addActionListener(this);  // For Select All


        // Add menu items to File menu
        file.add(i1);
        file.add(i2);
        file.add(i3);

        // Add menu items to Edit menu
        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);

        // Add menus to the menu bar
        mb.add(file);
        mb.add(edit);

        // Set the menu bar to the frame
        this.setJMenuBar(mb);

        // Create the text area
        ta = new JTextArea();
        ta.setBounds(10, 10, 370, 370);  // Set bounds for the text area
        c.add(ta);  // Add the text area to the container
    }

    // Override the actionPerformed method to handle menu item events
    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == i1) {  // "New" is clicked
        ta.setText("New File.. ");
    }
    if (e.getSource() == i2) {  // "Open" is clicked
        ta.setText("Open File.. ");
    }
    if (e.getSource() == i3) {  // "Save" is clicked
        ta.setText("Save File.. ");
    }
    if (e.getSource() == i4) {  // "Cut" is clicked
         ta.cut();
    }
    if (e.getSource() == i5) {  // "Copy" is clicked
        ta.copy();
    }
    if (e.getSource() == i6) {  // "Paste" is clicked
        ta.paste();
    }
    if (e.getSource() == i7) {  // "Select All" is clicked
        ta.selectAll();
    }
}
  // Clear the existing text in the text area
        }
    

public class ActionEvent3 {
    public static void main(String[] args) {
        // Create a frame object and set its properties
        MyFrame obj = new MyFrame();
        obj.setTitle("Action Event");
        obj.setBounds(100, 100, 400, 400);  // Set the frame's size and position
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set default close operation
        obj.setVisible(true);  // Make the frame visible
    }
}

