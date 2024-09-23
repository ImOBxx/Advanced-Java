import java.awt.*;

// Driver Class
class Languages {
    // Main Function
    public Languages() {
        // Frame Created
        Frame f = new Frame();

        Label l1 = new Label("Select known Languages");
        l1.setBounds(80, 50, 200, 30); // Adjusted width and height for the label
        f.add(l1);

        // CheckBox created
        Checkbox c2 = new Checkbox(" 1. Hindi");
        c2.setBounds(100, 100, 100, 30); // Adjusted width and height for the checkbox
        f.add(c2);

        // CheckBox created
        Checkbox c3 = new Checkbox(" 2. English");
        c3.setBounds(100, 150, 100, 30); // Adjusted width and height for the checkbox
        f.add(c3);

        // CheckBox created
        Checkbox c4 = new Checkbox(" 3. Marathi");
        c4.setBounds(100, 200, 100, 30); // Adjusted width and height for the checkbox
        f.add(c4);

        f.setSize(4000, 300); // Adjusted size for the frame
        f.setLayout();
        f.setVisible(true);
    }

    public static void main(String ar[]) {
        new Languages();
    }
}
