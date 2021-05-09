import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SupplierForm {
    Label l1,l2,l3,l4,l5,l6;
    TextField tf,tf1,tf2,tf3,tf4,tf5;
    TextArea ta;
    Button b1;
    SupplierForm(){
        Frame f=new Frame("My shop");
        l1=new Label("Enter supplier details");
        l1.setBounds(200,50,180,20);
        f.add(l1);

        l2=new Label("supplier id");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf=new TextField();
        tf.setBounds(130,120,100,20);
        f.add(tf);

        l3=new Label("supplier name");
        l3.setBounds(10,170,100,20);
        f.add(l3);
        tf1=new TextField();
        tf1.setBounds(120,170,100,20);
        f.add(tf1);
        l4=new Label("supplier address ");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        tf2=new TextField();
        tf2.setBounds(120,200,100,20);
        f.add(tf2);

        l5=new Label("P name");
        l5.setBounds(10,250,100,20);
        f.add(l5);
        tf3=new TextField();
        tf3.setBounds(120,250,100,20);
        f.add(tf3);

        l6=new Label("CP");
        l6.setBounds(10,300,100,20);
        f.add(l6);
        tf4=new TextField();
        tf4.setBounds(120,300,100,20);
        f.add(tf4);

        l6=new Label("Pid");
        l6.setBounds(10,350,100,20);
        f.add(l6);
        tf5=new TextField();
        tf5.setBounds(120,350,100,20);
        f.add(tf5);


        Label lq=new Label("info");
        lq.setBounds(10,450,650,50);
        f.add(lq);
        ta=new TextArea();
        ta.setBounds(10,500,300,100);
        f.add(ta);

        Button b=new Button("Add supplier");
        b.setBounds(150,420,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sid=tf.getText();
                String sname=tf1.getText();
                String saddr=tf2.getText();
                String pName=tf3.getText();
                String CP=tf4.getText();
                String Pid=tf5.getText();
                String res=s.addsupplier(sid,sname,saddr,pName,CP,Pid);
                lq.setText(res);
                displaydata();
            }
        });
        Button b1=new Button("Remove supplier");
        b1.setBounds(300,420,100,30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=s.removesupplier();
                lq.setText(res);
                displaydata();
            }
        });
        Button b2=new Button("update supplier");
        b2.setBounds(400,420,100,30);
        f.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=s.updatesupplier();
                lq.setText(res);
                displaydata();
            }
        });
        Button b3=new Button("supplied product");
        b3.setBounds(500,420,100,30);
        f.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=s.suppliedproduct();
                lq.setText(res);
                displaydata();
            }
        });
        f.setSize(800,700);
        f.setLayout(null);
        f.setVisible(true);
    }
    Supplier s=new Supplier();
    public void displaydata()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("supplier id : " + s.getSup_id() + "\n");
        sb.append("supplier name : " + s.getSup_name() + "\n");
        sb.append("supplier address : " + s.getSup_address() + "\n");
        sb.append("product name : " + s.getPname() + "\n");
        sb.append("CP: " + s.getCp() + "\n");
        sb.append("Pid : " + s.getPid() + "\n");
        ta.setText(sb.toString());
    }

    public static void main(String[] args) {
        SupplierForm s1=new SupplierForm();
    }
}


