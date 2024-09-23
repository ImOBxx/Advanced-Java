
import javax.swing.*;


public class TableExample {
    public static void main(String[] args) {
        new MyTable();
    }
}

class MyTable extends JFrame {

    JTable table;

    MyTable() {

        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Object[][] data = {{101, "Ram", 21}, {102, "Shyam", 18}, {103, "Raju", 28}};

        String[] columnNames = {"Roll No. ", "Names", "Age"};
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        table = new JTable(model);

        add(new JScrollPane(table));

        validate();



        
    }




}