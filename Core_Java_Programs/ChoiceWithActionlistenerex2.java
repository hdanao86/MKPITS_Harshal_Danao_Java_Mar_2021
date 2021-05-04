//Java AWT Choice Example with ActionListener


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;

public class ChoiceWithActionlistenerex2 {
    ChoiceWithActionlistenerex2(){
        Frame f=new Frame();
        final Label l=new Label();
        l.setAlignment(l.CENTER);
        l.setSize(400,100);
        Button b=new Button("show");
        b.setBounds(200,100,50,20);
        final Choice c=new Choice();
        c.setBounds(100,100,75,75);
        c.add("c");
        c.add("c++");
        c.add("java");
        c.add("php");
        c.add("android");
        f.add(c);
        f.add(l);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="Programming data selected : " + c.getItem(c.getSelectedIndex());
                l.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        ChoiceWithActionlistenerex2 c1=new ChoiceWithActionlistenerex2();
    }
}
