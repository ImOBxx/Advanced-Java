
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;

public class GridLayoutExample extends JFrame{


          JButton b1 = new JButton("Button 1");
          JButton b2 = new JButton("Button 2");
          JButton b3 = new JButton("Button 3");
          JButton b4 = new JButton("Button 4");
          JButton b5 = new JButton("Button 5");


          public GridLayoutExample()
          {
             setTitle("Grid Layout Example");
             setBounds(100, 200, 500, 300);
             setVisible(true);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             Container c = getContentPane();

             GridLayout g = new GridLayout(2, 3, 15, 10);
             //g.setVgap(10);
             //g.setHgap(20);
             c.setLayout(g);

             c.add(b1);
             c.add(b2, 4);
             c.add(b3, 2);
             c.add(b4, 0);
             c.add(b5, 1);
          }

    public static void main(String[] args) {
         new GridLayoutExample();
        
    }
}
