import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldDemo extends JFrame {
 JTextField firstnameTextField,lastnameTextField;
 JTextArea addressTextArea;
 JCheckBox checkBox1,checkBox2,checkBox3;
 ButtonGroup genderButtonGroup;
 JRadioButton maleRadioButton,femaleRadioButton;
 
 JPanel panel;
 
 public TextFieldDemo() {
  firstnameTextField=new JTextField(20);
  lastnameTextField=new JTextField(20);
  addressTextArea=new JTextArea(10, 20);
  checkBox1=new JCheckBox("10th");
  checkBox2=new JCheckBox("12th");
  checkBox3=new JCheckBox("Graduate");
  
  genderButtonGroup=new ButtonGroup();
  maleRadioButton=new JRadioButton("Male");
  femaleRadioButton=new JRadioButton("Female");
  
  panel=new JPanel();
  add(panel);
  
  panel.add(firstnameTextField);
  panel.add(lastnameTextField);
  panel.add(addressTextArea);
  panel.add(checkBox1);
  panel.add(checkBox2);
  panel.add(checkBox3);
  
  
  genderButtonGroup.add(maleRadioButton);
  genderButtonGroup.add(femaleRadioButton);
  panel.add(maleRadioButton);
  panel.add(femaleRadioButton);
  
  
  
  
  setSize(400,400);
  setTitle("My App");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
  setResizable(false);
 }
 

 public static void main(String[] args) {
  new TextFieldDemo();
 }
}