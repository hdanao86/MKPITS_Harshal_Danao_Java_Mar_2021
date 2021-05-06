import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AwtRadiusEx4 {
    AwtRadiusEx4(){
        JFrame f=new JFrame("welcome");
        JLabel l1=new JLabel("enter radius : ");
        l1.setBounds(10,50,100,30);
        f.add(l1);
        JTextField tf=new JTextField();
        tf.setBounds(110,50,100,30);
        f.add(tf);
        Checkbox checkbox1=new Checkbox("area");
        checkbox1.setBounds(100,100,50,50);
        Checkbox checkbox2=new Checkbox("circumference");
        checkbox2.setBounds(180,100,50,50);
        f.add(checkbox1);
        f.add(checkbox2);

        JLabel l2=new JLabel("Answer : ");
        l2.setBounds(20,150,300,100);
        f.add(l2);

        JButton b=new JButton("result");
        b.setBounds(100,150,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                //int r;
                double circ;
                double pi = 3.14, area;
                int r = Integer.parseInt(tf.getText());
                area = pi * r * r;
                circ = 2 * pi * r;

                if (checkbox1.getState() == true) {
                    area = pi * r * r;
                    sb.append("area = " + area);
                  }
                    if (checkbox2.getState() == true)
                    {
                        circ = 2 * pi * r;
                        sb.append(" circumference = " + circ);
                    }
                    l2.setText(sb.toString());
                }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        AwtRadiusEx4 a=new AwtRadiusEx4();
    }
}
