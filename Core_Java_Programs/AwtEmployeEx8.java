import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtEmployeEx8 {
    AwtEmployeEx8(){
        JFrame f=new JFrame("welcome");
        JLabel l=new JLabel("empname");
        l.setBounds(10,50,100,30);
        f.add(l);
        JTextField tf=new JTextField();
        tf.setBounds(110,50,100,30);
        f.add(tf);
        JLabel l1=new JLabel("designation");
        l1.setBounds(10,100,100,30);
        f.add(l1);
        JTextField tf1=new JTextField();
        tf1.setBounds(110,100,100,30);
        f.add(tf1);
        JLabel l2=new JLabel("basic salary");
        l2.setBounds(10,150,100,30);
        f.add(l2);
        JTextField tf2=new JTextField();
        tf2.setBounds(110,150,100,30);
        f.add(tf2);
        JTextArea t3=new JTextArea();
        t3.setBounds(20,250,300,200);
        f.add(t3);
        JButton b=new JButton("show");
        b.setBounds(100,200,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int basic_salary;
                double hra,da;
                double total_salary;
                StringBuilder sb=new StringBuilder();
                sb.append("empname = " + tf.getText()+ "\n");
                sb.append(tf1.getText() + "\n");
                sb.append(tf2.getText() + "\n");
                basic_salary=Integer.parseInt(tf2.getText());

                    hra=basic_salary*0.25f;
                    sb.append("hra = " + hra + "\n");

                //t3.setText("hra = "+ hra);

                    da=basic_salary*0.35f;
                    sb.append("da = " + da + "\n");

               // t3.setText("da " + da);

                    total_salary=basic_salary+hra+da;
                    sb.append("total salary = " + total_salary + "\n");

                //t3.setText("total_salary = "+ total_salary);
                t3.setText(sb.toString());
            }
        });
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        AwtEmployeEx8 a=new AwtEmployeEx8();
    }
}
