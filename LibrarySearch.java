//Eric Maina
//CT100/G/21350/24
//Library swing code --no jtable
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LibrarySearch extends JFrame implements ActionListener {

    JTextField search;
    JTextArea result, history;

    String books[][] = {
        {"Java","John","111","Yes"},
        {"Python","Ann","222","No"},
        {"C++","Mike","333","Yes"},
        {"DBMS","Jane","444","Yes"}
    };

    public LibrarySearch(){
        setTitle("Library Search");
        setSize(400,400);
        setLayout(new FlowLayout());

        search=new JTextField(20);
        JButton btn=new JButton("Search");

        result=new JTextArea(10,30);
        history=new JTextArea(5,30);

        add(search); add(btn);
        add(new JLabel("Results")); add(result);
        add(new JLabel("History")); add(history);

        btn.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String key=search.getText().toLowerCase();
        result.setText("");

        for(int i=0;i<books.length;i++){
            if(books[i][0].toLowerCase().contains(key)){
                result.append(books[i][0]+" "+books[i][1]+"\n");
            }
        }

        history.append(key+"\n");
    }

    public static void main(String[] args){
        new LibrarySearch();
    }
}
