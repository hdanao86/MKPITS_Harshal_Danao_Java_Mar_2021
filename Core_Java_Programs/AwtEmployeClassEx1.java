import javax.swing.*;
import java.util.ArrayList;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class AwtEmployeClassEx1 extends JFrame {
    JLabel l1,l2,l3;
    JTextField tf1,tf2,tf3;
    JTextArea ta;
    JButton b1,b2;
    ArrayList<String > student=new ArrayList<String >();
    public AwtEmployeClassEx1(){
        l1=new JLabel("emp no");
        l1.setBounds(10,50,100,30);
        add(l1);
        tf1=new JTextField();
        tf1.setBounds(110,50,100,30);
        add(tf1);

        l2=new JLabel("emp name");
        l2.setBounds(10,100,100,30);
        add(l2);
        tf2=new JTextField();
        tf2.setBounds(110,100,100,30);
        add(tf2);

        l3=new JLabel("designation");
        l3.setBounds(10,150,100,30);
        add(l3);
        tf3=new JTextField();
        tf3.setBounds(110,150,100,30);
        add(tf3);

        b1=new JButton("add emp");
        b1.setBounds(20,200,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.add("\n" + "emp no : " + tf1.getText() + "\n" + "emp name :"+tf2.getText() + "\n" + "designation : "+tf3.getText());
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
        });
        add(b1);

        b2=new JButton("display emp");
        b2.setBounds(180,200,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for (String  str : student)
                {
                    sb.append("student details : " +str + "\n");

                }
                ta.setText(sb.toString());
            }
        });
        add(b2);

        ta=new JTextArea("emp details");
        ta.setBounds(10,250,250,250);
        add(ta);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        AwtEmployeClassEx1 aw=new AwtEmployeClassEx1();
    }
}

