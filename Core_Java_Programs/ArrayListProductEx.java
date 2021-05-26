//repeat all the program for product name collection
import java.io.FileReader;
import java.util.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ArrayListProductEx  {

    /*JLabel l1,l2;
    JTextField t1,t2;
    JTextArea ta;
    JButton b1,b2,b3,b4;
    ArrayList<String> product =new ArrayList<String>();
    public ArrayListProductEx() {
        l1=new JLabel("enter product name");
        l1.setBounds(10,50,200,30);
        add(l1);
        t1=new JTextField();
        t1.setBounds(220,50,200,30);
        add(t1);
        b1=new JButton("add product");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.add(t1.getText());
                t1.setText("");
            }
        });
        add(b1);
        b2=new JButton("display product");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
            /*
            Iterator itr=student.iterator();
            while (itr.hasNext()) {
                sb.append("student name : " + itr.next() +"\n");
            }

             */
      /*          for(String str : product) {
                    sb.append("student name : " + str +"\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);
        ta=new JTextArea("student list");
        ta.setBounds(100,200,300,150);
        add(ta);

        l2=new JLabel("enter index no to view ");
        l2.setBounds(10,360,200,30);
        add(l2);
        t2=new JTextField();
        t2.setBounds(220,360,200,30);
        add(t2);
        b3=new JButton("get method");
        b3.setBounds(100,400,150,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=   product.get(Integer.parseInt(t2.getText()));
                ta.setText("product name at index " + t2.getText() + " : " + res );
            }
        });
        add(b3);
        b4=new JButton("set method");
        b4.setBounds(260,400,150,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.set(Integer.parseInt(t2.getText()),t1.getText()) ;
            }
        });
        add(b4);

        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }*/





    public static void main(String[] args) {
        ArrayList<String > prod=new ArrayList<String >();
       /* prod.add("TV");
        prod.add("fridge");
        prod.add("bed");
        prod.add("oven");
        prod.add("machine");
        System.out.println(prod);*/

       Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter product name");
            String sn=sc.next();
            prod.add(sn);
        }
       // Collections.sort(prod);
      /*  System.out.println("product at index 1: " + prod.get(1));
        prod.set(1,"fridge");
        */
       // System.out.println(prod);
        /*Iterator itr=prod.iterator();
        while (itr.hasNext()){
            System.out.println("product name : " + itr.next());
        }*/
   /* for (String str : prod){
        System.out.println("product name : " + str);*/

       /* for (int i=0;i<prod.size();i++){
            System.out.println(prod.get(i));*/
        prod.forEach(a->{
            System.out.println(a);
        });
    }
    }



