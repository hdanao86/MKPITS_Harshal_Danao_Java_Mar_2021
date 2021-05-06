import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtMarksEx5 {
    AwtMarksEx5()
    {
        JFrame f=new JFrame("welcome");
        JLabel l=new JLabel("roll no : ");
        l.setBounds(10,50,100,50);
        f.add(l);
        JTextField tf=new JTextField();
        tf.setBounds(110,50,100,30);
        f.add(tf);
        JLabel l1=new JLabel("sub 1 : ");
        l1.setBounds(10,100,100,50);
        f.add(l1);
        JTextField tf1=new JTextField();
        tf1.setBounds(110,100,100,30);
        f.add(tf1);
        JLabel l2=new JLabel("sub 2 : ");
        l2.setBounds(10,150,100,50);
        f.add(l2);
        JTextField tf2=new JTextField();
        tf2.setBounds(110,150,100,30);
        f.add(tf2);
        JLabel l3=new JLabel("sub 3 : ");
        l3.setBounds(10,200,100,50);
        f.add(l3);
        JTextField tf3=new JTextField();
        tf3.setBounds(110,200,100,30);
        f.add(tf3);
        JLabel l4=new JLabel("answer");
        l4.setBounds(20,280,400,100);
        f.add(l4);
        JButton b=new JButton("result");
        b.setBounds(100,250,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                double total, per;
                int a = Integer.parseInt(tf.getText());
                int s1 = Integer.parseInt(tf1.getText());
                int s2 = Integer.parseInt(tf2.getText());
                int s3 = Integer.parseInt(tf3.getText());
                {
                    total = s1 + s2 + s3;
                    sb.append("roll no of " + a + " total = "   + total);
                }
                    l4.setText(sb.toString());
                {
                    per = (total/300)*100;
                    sb.append("roll no of " + a + " per = "   + per);
                }
                if (per<=100 && per>90)
                {
                    sb.append("grade : A" );
                }
                if (per<=90 && per>80)
                {
                    sb.append("grade : B ");
                }
                if (per<=80 && per>=70)
                {
                    sb.append("grade : c ");
                }
                l4.setText(sb.toString());

            }
        });
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        AwtMarksEx5 a=new AwtMarksEx5();
    }
}
