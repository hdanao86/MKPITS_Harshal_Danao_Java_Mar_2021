import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.io.*;
import java.awt.*;

public class AwtMyClientEx1 extends JFrame {
    JLabel l1;
    JTextField tf1;
    JTextArea ta;
    JButton b1,b2;
    AwtMyClientEx1(){
        l1=new JLabel("enter message");
        l1.setBounds(10,50,100,30);
        add(l1);
        tf1=new JTextField();
        tf1.setBounds(120,50,100,30);
        add(tf1);

        ta=new JTextArea("message Here");
        ta.setBounds(10,100,200,200);
        add(ta);

        b1=new JButton("Send");
        b1.setBounds(20,300,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                    Socket s = new Socket("localhost", 3333);
                    DataInputStream din = new DataInputStream(s.getInputStream());
                    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


                    String str = "";
                    String str2 = "";
                    System.out.println("message enter :");
                    while (!str.equals("stop")) {
                        str = br.readLine();
                        dout.writeUTF(str);
                        dout.flush();

                        str2 = din.readUTF();
                        System.out.println("server says : " + str2);
                    }

                    dout.close();
                    s.close();

                }catch (Exception ee)
                {
                    System.out.println(ee);
                }
            }
        });
        add(b1);

        b2=new JButton("Receive");
        b2.setBounds(120,300,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(b2);

        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        AwtMyClientEx1 a=new AwtMyClientEx1();
    }
}
