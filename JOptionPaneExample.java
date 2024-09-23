
import javax.swing.*;

public class JOptionPaneExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("JOptionPane");
        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* 
        JOptionPane.showMessageDialog(f, "Hello, Advance Java");

        JOptionPane.showMessageDialog(f, "Please Charge Laptop, Low Battery.", "Battery Staus", JOptionPane.WARNING_MESSAGE);

         

        int result = JOptionPane.showConfirmDialog(f, "Do you want to delete item now?");
         
        switch(result) {
        case JOptionPane.YES_OPTION:
            System.out.println("Yes Delete");
        break;
        case JOptionPane.NO_OPTION:
            System.out.println("Cannot Delete");
        break;
        case JOptionPane.CANCEL_OPTION:
            System.out.println("Delete Operation Cancel");
        break;
        case JOptionPane.CLOSED_OPTION:
            System.out.println("Dialog Box Cancel");
        break;

        */
        
        //String name= JOptionPane.showInputDialog(f, "Please Enter Your Name: ");
        //System.out.println("Your Name Is: " + name);
        JTextField userField=new JTextField();
        JPasswordField passwordField=new JPasswordField();
        
        String message="Please Enter Your Username and Password:";
        int result=JOptionPane.showOptionDialog(f,new Object[] {message,userField,passwordField},"Login",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null );
        if(result==JOptionPane.OK_OPTION) {
         System.out.println(userField.getText().toString()+" "+new String(passwordField.getPassword()));
         System.exit(0);
      
             }
        }

    }
