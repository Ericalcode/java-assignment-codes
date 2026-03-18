//Eric Maina 
//ct100/g/21350/24
//Java swing programs
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {

    JTextField idField, nameField, courseField, yearField;
    JComboBox<String> deptBox;
    JRadioButton male, female, other;
    JCheckBox hostel;
    JTextArea output;
    JButton register, clear;

    public StudentRegistration() {
        setTitle("Student Registration");
        setSize(400, 500);
        setLayout(new GridLayout(0, 2));

        // Fields
        idField = new JTextField();
        nameField = new JTextField();
        courseField = new JTextField();
        yearField = new JTextField();

        deptBox = new JComboBox<>(new String[]{"IT", "Business", "Engineering", "Science"});

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male); bg.add(female); bg.add(other);

        hostel = new JCheckBox("Hostel Required");

        register = new JButton("Register");
        clear = new JButton("Clear");

        output = new JTextArea(5, 20);

        // Add components
        add(new JLabel("Student ID")); add(idField);
        add(new JLabel("Full Name")); add(nameField);
        add(new JLabel("Course")); add(courseField);
        add(new JLabel("Year")); add(yearField);
        add(new JLabel("Department")); add(deptBox);

        add(male); add(female);
        add(other); add(hostel);

        add(register); add(clear);
        add(new JLabel("Output")); add(new JScrollPane(output));

        // Events
        register.addActionListener(this);
        clear.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == register) {
            // Validation
            if (idField.getText().isEmpty() || nameField.getText().isEmpty()
                    || courseField.getText().isEmpty() || yearField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fill all fields!");
                return;
            }

            String gender = male.isSelected() ? "Male" :
                            female.isSelected() ? "Female" : "Other";

            output.setText(
                "ID: " + idField.getText() +
                "\nName: " + nameField.getText() +
                "\nCourse: " + courseField.getText() +
                "\nYear: " + yearField.getText() +
                "\nDept: " + deptBox.getSelectedItem() +
                "\nGender: " + gender +
                "\nHostel: " + (hostel.isSelected() ? "Yes" : "No")
            );
        }

        if (e.getSource() == clear) {
            idField.setText(""); nameField.setText("");
            courseField.setText(""); yearField.setText("");
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}
