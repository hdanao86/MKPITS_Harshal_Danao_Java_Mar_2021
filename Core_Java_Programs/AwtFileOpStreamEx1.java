import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class AwtFileOpStreamEx1 extends Frame {
    Button b1;
    Label l1,l2,l3;
    TextField tf,tf1;
    AwtFileOpStreamEx1(){
        l1=new Label("enter your name");
        l1.setBounds(10,40,100,20);
        add(l1);
        tf=new TextField();
        tf.setBounds(120,40,200,20);
        add(tf);
        l2=new Label("enter email");
        l2.setBounds(10,80,100,20);
        add(l2);
        tf1=new TextField();
        tf1.setBounds(120,80,200,20);
        add(tf1);

        l3=new Label("status");
        l3.setBounds(10,160,200,20);
        add(l3);

        b1=new Button("save");
        b1.setBounds(100,120,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n="Name : " + tf.getText();
                String n1="\nEmail : " + tf1.getText();
                try {
                    FileOutputStream fout=new FileOutputStream("H://fn.txt");
                    byte[] b=n.getBytes();
                    fout.write(b);
                    b=n1.getBytes();
                    fout.write(b);
                    fout.close();
                    l3.setText("success");
                }catch (Exception ee)
                {
                  //  System.out.println(ee);
                }
            }
        });
        add(b1);
        setSize(350,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AwtFileOpStreamEx1 aw=new AwtFileOpStreamEx1();
    }
}
