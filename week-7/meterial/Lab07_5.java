import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

class StudentManagement extends JFrame {
    public StudentManagement(){
        super("Student Management System");
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        //Title
        JLabel title = new JLabel("<html><h1>Student Management<h1><html>");
        title.setBounds(20,10,300,30);
        add(title);
        setVisible(true);

        // title for textField
        String[] titleField = {"First Name","Last Name","Age","Major"};
        JLabel[] titleTextField =new JLabel[titleField.length];
        for(int i=0;i<titleField.length;i++){
            titleTextField[i] = new JLabel(titleField[i]);
            titleTextField[i].setBounds(25+150*i,50,200,20);
            add(titleTextField[i]);
        }
        // jTextField
        JTextField[] textFields = new JTextField[titleField.length];
        for(int i=0;i<textFields.length;i++){
            textFields[i] = new JTextField();
            textFields[i].setBounds(25+150*i,70,150,25);
            add(textFields[i]);

        }
        //button add
        Button btnAdd = new Button("ADD");
        btnAdd.setBounds(640,70,120,25);
        btnAdd.setBackground(Color.BLUE);
        btnAdd.setForeground(Color.white);
        add(btnAdd);
        //table
        JPanel ptable = new JPanel();
        ptable.setLayout(new GridLayout());
        ptable.setBounds(25,120,735,300);
        ptable.setBackground(Color.RED);
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("First name");
        defaultTableModel.addColumn("Last name");
        defaultTableModel.addColumn("Age");
        defaultTableModel.addColumn("Major");
        btnAdd.addActionListener(e->{
            defaultTableModel.addRow(new Object[]{textFields[0].getText(),textFields[1].getText(),textFields[2].getText(),textFields[3].getText()});
        });
        JTable table = new JTable(defaultTableModel);
        DefaultTableModel defaultTable = new DefaultTableModel();
        defaultTable.addRow(new Object[]{"a","b","c","d"});
        JScrollPane scrollPane = new JScrollPane(table);
        ptable.add(scrollPane);
        add(ptable);
        //click


        revalidate();
        repaint();
    }
}
public class Lab07_5 {
    public static void main(String[] args){
        StudentManagement studentManagement = new StudentManagement();
    }
}
