//example of checkbox to do additon and substraction of 2 no.

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.ECField;

public class Checkboxexample2 {
    Checkboxexample2(){
        Frame f=new Frame("checkbox Example");
        Label l=new Label();
        l.setBounds(100,200,300,20);
        f.add(l);
        Label l1=new Label();
        l1.setBounds(100,250,300,20);
        f.add(l1);
        TextField t1=new TextField();
        t1.setBounds(10,50,100,20);
        f.add(t1);
        TextField t2=new TextField();
        t2.setBounds(110,50,100,20);
        f.add(t2);

        Checkbox checkbox1=new Checkbox("add");
        checkbox1.setBounds(100,100,50,50);
        Checkbox checkbox2=new Checkbox("sub");
        checkbox2.setBounds(100,150,50,50);
        f.add(checkbox1);
        f.add(checkbox2);

        Button b=new Button("result");
        b.setBounds(10,300,100,50);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("");
                l.setText("");
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                int res=0;
                StringBuilder sb=new StringBuilder();
                if (checkbox1.getState()==true)
                {
                    res=n1+n2;
                    sb.append("add is " + res);
                }
                if (checkbox2.getState()==true)
                {
                    res=n1-n2;
                    sb.append("sub is "  + res);
                }
                l.setText(sb.toString());
            }
        });
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Checkboxexample2 c=new Checkboxexample2();
    }
}
