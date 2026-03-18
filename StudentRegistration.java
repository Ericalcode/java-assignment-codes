//ct100/g/21350/24
//Eric Maina
//Calculator

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField t;
    double num1;
    String op;

    public Calculator(){
        setTitle("Calculator");
        setSize(300,300);
        setLayout(new GridLayout(5,4));

        t = new JTextField();
        add(t);

        String b[]={"7","8","9","/",
                    "4","5","6","*",
                    "1","2","3","-",
                    "0",".","=","+",
                    "C"};

        for(int i=0;i<b.length;i++){
            JButton btn=new JButton(b[i]);
            add(btn);
            btn.addActionListener(this);
        }

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();

        if(s.matches("[0-9.]")){
            t.setText(t.getText()+s);
        }
        else if(s.matches("[+\\-*/]")){
            num1=Double.parseDouble(t.getText());
            op=s;
            t.setText("");
        }
        else if(s.equals("=")){
            double num2=Double.parseDouble(t.getText());
            double r=0;

            if(op.equals("+")) r=num1+num2;
            if(op.equals("-")) r=num1-num2;
            if(op.equals("*")) r=num1*num2;
            if(op.equals("/")){
                if(num2==0){
                    JOptionPane.showMessageDialog(this,"Error");
                    return;
                }
                r=num1/num2;
            }
            t.setText(""+r);
        }
        else if(s.equals("C")){
            t.setText("");
        }
    }

    public static void main(String[] args){
        new Calculator();
    }
}
