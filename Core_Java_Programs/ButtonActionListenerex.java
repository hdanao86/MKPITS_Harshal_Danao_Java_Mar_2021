//Java AWT Button Example with ActionListener

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class ButtonActionListenerex {
    public static void main(String[] args) {
        Frame f=new Frame("button example");
        final TextField tf=new TextField();
        tf.setBounds(50,50,150,20);
        Button b=new Button("clicke here");
        b.setBounds(50,100,60,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("welcome to java");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
