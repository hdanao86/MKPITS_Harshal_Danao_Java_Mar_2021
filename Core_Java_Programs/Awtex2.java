import com.sun.xml.internal.ws.api.server.EndpointReferenceExtensionContributor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Awtex2 extends Frame{
    TextField tf;
    Awtex2(){
        tf=new TextField();
        tf.setBounds(60,50,170,20);

        Button b=new Button("click me");
        b.setBounds(100,120,80,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("welcome");
            }
        });
        add(b);
        add(tf);
        Button b1=new Button("clear");
        b1.setBounds(100,160,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });
        add(b1);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Awtex2 a=new Awtex2();
    }
}
