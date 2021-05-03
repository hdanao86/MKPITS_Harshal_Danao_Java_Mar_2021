//awt example
//1 - create a ui with 2 button and do event handling
//within the class(same class)

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventex1 extends Frame implements ActionListener {
    Button b1,b2;
    Label l1;//used for non editable text
    Eventex1(){
        b1=new Button("button 1");
        b1.setBounds(100,100,100,25);
        b1.addActionListener(this);
        add(b1);
        b2=new Button("Button 2");
        b2.setBounds(100,200,100,25);
        b2.addActionListener(this);
        add(b2);
        l1=new Label("status");
        l1.setBounds(50,250,200,50);
        add(l1);
        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1){
            System.out.println("button 1 is clicked");
            l1.setText("button 1 is clicked");
        }
        if (ae.getSource()==b2){
            System.out.println("button 2 is clicked");
            l1.setText("button 2 is clicked");
        }
    }

    public static void main(String[] args) {
        Eventex1 e=new Eventex1();
    }
}
