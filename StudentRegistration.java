import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {

    JTextField id, name, course, year;
    JComboBox dept;
    JRadioButton m, f, o;
    JCheckBox hostel;
    JTextArea area;
    JButton reg, clear;

    public StudentRegistration() {
        setTitle("Student Registration");
        setSize(400,400);
        setLayout(new GridLayout(0,2));

        id = new JTextField();
        name = new JTextField();
        course = new JTextField();
        year = new JTextField();

        dept = new JComboBox(new String[]{"IT","Business","Engineering","Science"});

        m = new JRadioButton("Male");
        f = new JRadioButton("Female");
        o = new JRadioButton("Other");

        ButtonGroup bg = new ButtonGroup();
        bg.add(m); bg.add(f); bg.add(o);

        hostel = new JCheckBox("Hostel");

        reg = new JButton("Register");
        clear = new JButton("Clear");

        area = new JTextArea();

        add(new JLabel("ID")); add(id);
        add(new JLabel("Name")); add(name);
        add(new JLabel("Course")); add(course);
        add(new JLabel("Year")); add(year);
        add(new JLabel("Dept")); add(dept);

        add(m); add(f);
        add(o); add(hostel);

        add(reg); add(clear);
        add(area);

        reg.addActionListener(this);
        clear.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==reg){
            if(id.getText().equals("") || name.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Fill all fields");
                return;
            }

            String gender = m.isSelected()?"Male":f.isSelected()?"Female":"Other";

            area.setText("ID: "+id.getText()+
            "\nName: "+name.getText()+
            "\nDept: "+dept.getSelectedItem()+
            "\nGender: "+gender+
            "\nHostel: "+(hostel.isSelected()?"Yes":"No"));
        }

        if(e.getSource()==clear){
            id.setText(""); name.setText("");
            course.setText(""); year.setText("");
            area.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}
