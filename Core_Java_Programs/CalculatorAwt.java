import sun.util.resources.cldr.sq.CalendarData_sq_AL;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorAwt {
    int pn=0;
    int n=0;
    char op;
    CalculatorAwt()
    {
        Frame f=new Frame();
        TextField t1=new TextField();
        t1.setBounds(10,40,240,25);
        f.add(t1);
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Button b7=new Button("7");
        Button b8=new Button("8");
        Button b9=new Button("9");
        Button b10=new Button("c");
        Button b11=new Button("0");
        Button b12=new Button("=");
        Button b13=new Button("+");
        Button b14=new Button("-");
        Button b15=new Button("*");
        Button b16=new Button("/");
        b1.setBounds(10,50,80,50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                    t1.setText(" ");
                    t1.setText("1");
                }
                else {
                    t1.setText(str + "1");
                }
            }
        });
        f.add(b1);
        b2.setBounds(90,50,80,50);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                    t1.setText(" ");
                    t1.setText("2");
                }
                else {
                    t1.setText(str + "2");
                }
            }
        });
        f.add(b2);
        b3.setBounds(170,50,80,50);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                    t1.setText(" ");
                    t1.setText("3");
                }
                else {
                    t1.setText(str + "3");
                }
            }
        });
        f.add(b3);
        b4.setBounds(10,100,80,50);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                    t1.setText(" ");
                    t1.setText("4");
                }
                else {
                    t1.setText(str + "4");
                }
            }
        });
        f.add(b4);
        b5.setBounds(90,100,80,50);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                    t1.setText(" ");
                    t1.setText("5");
                }
                else {
                    t1.setText(str + "5");
                }
            }
        });
        f.add(b5);
        b6.setBounds(170,100,80,50);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                    t1.setText(" ");
                    t1.setText("6");
                }
                else {
                    t1.setText(str + "6");
                }
            }
        });
        f.add(b6);
        b7.setBounds(10,150,80,50);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                    t1.setText(" ");
                    t1.setText("7");
                }
                else {
                    t1.setText(str + "7");
                }
            }
        });
        f.add(b7);
        b8.setBounds(90,150,80,50);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                    t1.setText(" ");
                    t1.setText("8");
                }
                else {
                    t1.setText(str + "8");
                }
            }
        });
        f.add(b8);
        b9.setBounds(170,150,80,50);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                    t1.setText(" ");
                    t1.setText("9");
                }
                else {
                    t1.setText(str + "9");
                }
            }
        });
        f.add(b9);
        b10.setBounds(10,200,80,50);
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String str=t1.getText();
                //if (str.equals("+") || str.equals("-")){
                //if (e.getSource()==b10)
                    t1.setText("");
                   // t1.setText("c");
            }
        });
        f.add(b10);
        b11.setBounds(90,200,80,50);
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                    t1.setText(" ");
                    t1.setText("0");
                }
                else {
                    t1.setText(str + "0");
                }
            }
        });
        f.add(b11);
        b12.setBounds(170,200,80,50);
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n=Integer.parseInt(t1.getText());
                int r=0;
                if(op=='+')
                    r=n+pn;
                else if (op=='-')
                    r=pn-n;
                t1.setText(String.valueOf(r));
                 if (op=='*')
                    r=pn*n;
                 t1.setText(String.valueOf(r));
                 if (op=='/')
                     r=pn/n;
                 t1.setText(String.valueOf(r));
            }
        });
        f.add(b12);
        b13.setBounds(10,250,60,40);
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn=Integer.parseInt(t1.getText());
                t1.setText("+");
                op='+';
            }
        });
        f.add(b13);
        b14.setBounds(69,250,60,40);
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn=Integer.parseInt(t1.getText());
                t1.setText("-");
                op='-';
            }
        });
        f.add(b14);
        b15.setBounds(129,250,60,40);
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn=Integer.parseInt(t1.getText());
                t1.setText("*");
                op='*';
            }
        });
        f.add(b15);
        b16.setBounds(189,250,80,50);
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn=Integer.parseInt(t1.getText());
                t1.setText("/");
                op='/';
            }
        });
        f.add(b16);
        f.setSize(300,300);
        f.setTitle("Calculator");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        CalculatorAwt c=new CalculatorAwt();
    }
}
