import java.awt.*;
import javax.swing.*;

public class MyRadioButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Radio Button");
        f.setBounds(100, 100, 700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JRadioButton radio1 = new JRadioButton("Male");
        radio1.setBounds(100, 50, 100, 20);
        c.add(radio1);

        JRadioButton radio2 = new JRadioButton("Female");
        radio2.setBounds(200, 50, 100, 20);
        c.add(radio2);

        Font font = new Font("Arial", Font.BOLD, 16);
        radio1.setFont((font));
        radio2.setFont((font));

        ButtonGroup gender = new ButtonGroup();
        gender.add(radio1);
        gender.add(radio2);

        JRadioButton gen =  new JRadioButton("General");
        JRadioButton ob  =  new JRadioButton("OBC");
        JRadioButton sc  =  new JRadioButton("SC");
        JRadioButton st  =  new JRadioButton("ST");

        gen.setBounds(100, 100, 100, 20);
        ob.setBounds(200, 100, 100, 20);
        sc.setBounds(300, 100, 100, 20);
        st.setBounds(400, 100, 100, 20);

        c.add(gen);
        c.add(ob);
        c.add(sc);
        c.add(st);

        ButtonGroup cas = new ButtonGroup();
        cas.add(gen);
        cas.add(ob);
        cas.add(sc);
        cas.add(st);

        gen.setSelected(true);

        gen.setEnabled(false);
        
        f.setVisible(true);
    }
}
