import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.*;

public class AwtFileInputStreamEx1 extends Frame {
    Button b1,b2;
    Label l1,l2,l3;
    TextField tf,tf1;
    TextArea ta;
    AwtFileInputStreamEx1(){
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
                String  n="Name : "  +tf.getText();
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

                }
            }
        });
        add(b1);

        ta=new TextArea();
        ta.setBounds(10,200,200,200);
        add(ta);

        b2=new Button("read");
        b2.setBounds(220,120,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream fin=new FileInputStream("H://fn.txt");
                    int i=0;
                    StringBuilder sb=new StringBuilder();
                    while ((i=fin.read())!= -1)
                    {
                        sb.append((char)i);
                    }
                    fin.close();
                    ta.setText(sb.toString());
                }catch (Exception ee)
                {

                }
            }
        });
        add(b2);
        setSize(350,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AwtFileInputStreamEx1 aw=new AwtFileInputStreamEx1();
    }
}
