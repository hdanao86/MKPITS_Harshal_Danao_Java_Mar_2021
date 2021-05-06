import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtFactEx1 {
    AwtFactEx1(){
        JFrame f=new JFrame("checkbox Example");
        final JLabel l1=new JLabel("enter number : ");
        l1.setBounds(10,110,200,30);
        JTextField tf=new JTextField();
        tf.setBounds(130,110,200,30);
        f.add(l1);
        f.add(tf);

        JLabel l2=new JLabel("factorial : ");
        l2.setBounds(10,300,300,50);
        f.add(l2);

        JButton b=new JButton("result");
        b.setBounds(100,260,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fact=1,a;
                a=Integer.parseInt(tf.getText());
                for (int i=1;i<=a;i++)
                {
                    fact=fact*i;
                }
                l2.setText("factorial is " + fact);
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        AwtFactEx1 a=new AwtFactEx1();
    }
}
