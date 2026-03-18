//Eric Maina
//ct100/g/21350/24
//Quiz Syst(java swing)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    JLabel q;
    JRadioButton a,b,c,d;
    JButton next;

    int i=0, score=0;

    String data[][]={
        {"2+2?","1","2","4","5","2"},
        {"Sun rises?","West","East","North","South","1"}
    };

    public Quiz(){
        setTitle("Quiz");
        setSize(300,300);
        setLayout(new FlowLayout());

        q=new JLabel();
        a=new JRadioButton();
        b=new JRadioButton();
        c=new JRadioButton();
        d=new JRadioButton();

        ButtonGroup bg=new ButtonGroup();
        bg.add(a);bg.add(b);bg.add(c);bg.add(d);

        next=new JButton("Next");

        add(q);add(a);add(b);add(c);add(d);add(next);

        next.addActionListener(this);

        load();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void load(){
        if(i<data.length){
            q.setText(data[i][0]);
            a.setText(data[i][1]);
            b.setText(data[i][2]);
            c.setText(data[i][3]);
            d.setText(data[i][4]);
        } else {
            JOptionPane.showMessageDialog(this,"Score: "+score);
        }
    }

    public void actionPerformed(ActionEvent e){
        if(c.isSelected() && data[i][5].equals("2")){
            score++;
        }
        i++;
        load();
    }

    public static void main(String[] args){
        new Quiz();
    }
}
