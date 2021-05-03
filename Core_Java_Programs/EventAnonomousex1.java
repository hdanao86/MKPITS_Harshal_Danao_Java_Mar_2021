//- example of event handling with anonymous class.

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventAnonomousex1 extends Frame {
    Button b1,b2;
    Label l1;
    EventAnonomousex1()
    {
        b1=new Button("button 1");
        b1.setBounds(100,100,100,25);
        //event handling with anonymous class
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("button 1 is clicked");
                }
        });
        add(b1);

        b2=new Button("button 2");
        b2.setBounds(100,200,100,25);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("button 2 is clicked");
            }
        });
        add(b2);
        l1=new Label("status : ");
        l1.setBounds(50,250,200,50);
        add(l1);
        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        EventAnonomousex1 e=new EventAnonomousex1();
    }
}
