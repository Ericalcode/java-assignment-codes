//Eric Maina
//ct100/g/21350/24
//Hotel booking stystem
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelBooking extends JFrame implements ActionListener {

    String rooms[]={"Available","Available","Available"};

    JTextArea display;

    public HotelBooking(){
        setTitle("Hotel Booking");
        setSize(300,300);
        setLayout(new FlowLayout());

        JButton book=new JButton("Book");
        display=new JTextArea(10,20);

        add(book); add(display);

        book.addActionListener(this);

        showRooms();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void showRooms(){
        display.setText("");
        for(int i=0;i<rooms.length;i++){
            display.append("Room "+(i+1)+" : "+rooms[i]+"\n");
        }
    }

    public void actionPerformed(ActionEvent e){
        rooms[0]="Booked";
        showRooms();
    }

    public static void main(String[] args){
        new HotelBooking();
    }
}
