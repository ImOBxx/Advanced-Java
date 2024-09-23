import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class JClass1409 {
    JFrame f;
    JList<String> dayList;
    JPanel panel;
    JComboBox<String> stateList;
    JButton saveButton, resetButton;

    public JClass1409() {
        f = new JFrame("My JList Demo");
        panel = new JPanel();
        JLabel label = new JLabel("Select Days Of The Week");

        saveButton = new JButton("Save");
        resetButton = new JButton("Clear");

        String[] dayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] states = {"Uttar Pradesh", "Maharashtra", "Madhya Pradesh", "Delhi", "Himachal Pradesh"};

        // Initializing JComboBox
        stateList = new JComboBox<>(states);

        dayList = new JList<>(dayName);

        // Adding components to the panel
        panel.add(stateList);
        panel.add(label);
        panel.add(dayList);
        panel.add(saveButton);
        panel.add(resetButton);

        // Select default value for JList
        dayList.setSelectedIndex(2);

        // Adding panel to frame
        f.add(panel);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JClass1409();
    }
}


"""
        
        
button.addActionListener(new ActionListener() {

    @Override
    public void actionPerfromed(ActionEvent e) {
        System.out.println("Hello");
     } };
}
"""
        
   