import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BillingForm {
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
    TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
    TextArea ta;
    Button b,b1;
    BillingForm(){
        Frame f=new Frame("My shop");
        l1=new Label("Enter Billing details");
        l1.setBounds(200,50,180,20);
        f.add(l1);

        l2=new Label("billing id");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf1=new TextField();
        tf1.setBounds(130,120,100,20);
        f.add(tf1);

        l3=new Label("product id");
        l3.setBounds(10,170,100,20);
        f.add(l3);
        tf2=new TextField();
        tf2.setBounds(120,170,100,20);
        f.add(tf2);
        l4=new Label("customer id");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        tf3=new TextField();
        tf3.setBounds(120,200,100,20);
        f.add(tf3);

        l5=new Label("order id");
        l5.setBounds(10,250,100,20);
        f.add(l5);
        tf4=new TextField();
        tf4.setBounds(120,250,100,20);
        f.add(tf4);

        l6=new Label("product name");
        l6.setBounds(10,300,100,20);
        f.add(l6);
        tf5=new TextField();
        tf5.setBounds(120,300,100,20);
        f.add(tf5);

        l7=new Label("discount");
        l7.setBounds(10,350,100,20);
        f.add(l7);
        tf6=new TextField();
        tf6.setBounds(120,350,100,20);
        f.add(tf6);

        l8=new Label("bill date");
        l8.setBounds(10,400,100,20);
        f.add(l8);
        tf7=new TextField();
        tf7.setBounds(120,400,100,20);
        f.add(tf7);

        l9=new Label("total bill ");
        l9.setBounds(10,450,100,20);
        f.add(l9);
        tf8=new TextField();
        tf8.setBounds(120,450,100,20);
        f.add(tf8);

        Label lq=new Label("info");
        lq.setBounds(10,500,650,50);
        f.add(lq);
        ta=new TextArea();
        ta.setBounds(10,550,300,100);
        f.add(ta);

        b=new Button("calculate");
        b.setBounds(150,420,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bid=tf1.getText();
                String pid=tf2.getText();
                String cid=tf3.getText();
                String oid=tf4.getText();
                String pname=tf5.getText();
                String discount=tf6.getText();
                String billdate=tf7.getText();
                String totalbill=tf8.getText();
                String res=b2.calculate(bid,pid,cid,oid,pname,discount,billdate,totalbill);
                lq.setText(res);
                displaydata();
            }
        });
        b1=new Button("payment");
        b1.setBounds(300,420,100,30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=b2.payment();
                lq.setText(res);
                displaydata();
            }
        });
        f.setSize(800,700);
        f.setLayout(null);
        f.setVisible(true);
    }
    Billing b2=new Billing();
    public void displaydata()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("bill id : " + b2.getBid() + "\n");
        sb.append("product id : " + b2.getP_id() + "\n");
        sb.append("customer id : " + b2.getC_id() + "\n");
        sb.append("order id : " + b2.getO_id() + "\n");
        sb.append("pname : " + b2.getPname() + "\n");
        sb.append("discount : " + b2.getDiscount() + "\n");
        sb.append("bill date : " + b2.getBill_dt() + "\n");
        sb.append("total bill : " + b2.getTotal_bill() + "\n");
        ta.setText(sb.toString());
    }

    public static void main(String[] args)
    {
        BillingForm b1=new BillingForm();
    }
}


