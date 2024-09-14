import javax.swing.*;

public class MyMenuBar {
    public static void main(String[] args) {
        JFrame f = new JFrame("MenuBar Example");
        f.setSize(600, 500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");

        file.add(i1);
        file.add(i2);
        file.add(i3);

        menubar.add(file);

        JMenu edit = new JMenu("Edit");

        JMenuItem i4 = new JMenuItem("Undo");
        JMenuItem i5 = new JMenuItem("Redo");

        edit.add(i4);
        edit.add(i5);

        file.add(edit);


        f.setJMenuBar(menubar);
        
        f.setVisible(true);
    }
}
