import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtProductEx6 {
    AwtProductEx6(){
        JFrame f=new JFrame("welcome");
        JLabel l=new JLabel("order no : ");
        l.setBounds(10,50,100,30);
        f.add(l);
        JTextField tf=new JTextField();
        tf.setBounds(110,50,100,30);
        f.add(tf);
        JLabel l1=new JLabel("product name : ");
        l1.setBounds(10,100,100,30);
        f.add(l1);
        JTextField tf1=new JTextField();
        tf1.setBounds(110,100,100,30);
        f.add(tf1);
        JLabel l2=new JLabel("qty : ");
        l2.setBounds(10,150,100,30);
        f.add(l2);
        JTextField tf2=new JTextField();
        tf2.setBounds(110,150,100,30);
        f.add(tf2);
        JLabel l3=new JLabel("rate : ");
        l3.setBounds(10,200,100,30);
        f.add(l3);
        JTextField tf3=new JTextField();
        tf3.setBounds(110,200,100,30);
        f.add(tf3);

        JTextArea t4=new JTextArea();
        t4.setBounds(20,280,300,150);
        f.add(t4);
        /*JLabel l5=new JLabel();
        l5.setBounds(20,280,200,150);
        f.add(l5);
        JLabel l6=new JLabel();
        l6.setBounds(20,310,200,150);
        f.add(l6);
        JLabel l7=new JLabel();
        l7.setBounds(20,340,200,150);
        f.add(l7);*/

        JButton b=new JButton("order");
        b.setBounds(100,250,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();

              //  int a=Integer.parseInt(tf.getText());
                //int pn=Integer.parseInt(tf1.getText());
               // int qt=Integer.parseInt(tf2.getText());
                //int ra=Integer.parseInt(tf3.getText());
                sb.append(" order "  + tf.getText() + "\n");

                sb.append(" product name"  + tf1.getText() + "\n");
              //l4.setText(sb.toString());
           //     l5.setText(sb.toString());
                sb.append(" qty " + tf2.getText() + "\n");
             //   l6.setText(sb.toString());
                sb.append(" rate " + tf3.getText() + "\n");
                t4.setText(sb.toString());
               // l7.setText(sb.toString());
               // {
                   // sb.append("order " + a);
               // }
                //{
                    //sb.append("produvt name " + pn);
               // }
                //{
                    //sb.append("qty " + qt);
                //}
                /*{
                    sb.append("rate " + ra);
                }
                {
                    total=qt*ra;
                    sb.append("total " + total);
                }*/
                //l4.setText(sb.toString());

            }
        });
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        AwtProductEx6 a=new AwtProductEx6();
    }
}
