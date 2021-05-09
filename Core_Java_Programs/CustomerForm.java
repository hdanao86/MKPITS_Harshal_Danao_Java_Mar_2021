import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerForm {
    Label l1,l2,l3,l4,l5;
    TextField tf1,tf2,tf3,tf4;
    TextArea ta;
    Button b,b1;
    CustomerForm(){
        Frame f=new Frame("My shop");
        l1=new Label("Enter customer details");
        l1.setBounds(100,50,200,20);
        f.add(l1);

        l2=new Label("customer id");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf1=new TextField();
        tf1.setBounds(130,120,100,20);
        f.add(tf1);

        l3=new Label("customer name");
        l3.setBounds(10,170,100,20);
        f.add(l3);
        tf2=new TextField();
        tf2.setBounds(120,170,100,20);
        f.add(tf2);

        l4=new Label("customer addr");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        tf3=new TextField();
        tf3.setBounds(120,210,100,20);
        f.add(tf3);


        l5=new Label("customer mob");
        l5.setBounds(10,250,100,20);
        f.add(l5);
        tf4=new TextField();
        tf4.setBounds(120,250,100,20);
        f.add(tf4);


        Label lq=new Label("info");
        lq.setBounds(10,350,650,50);
        f.add(lq);
        ta=new TextArea();
        ta.setBounds(10,400,300,200);
        f.add(ta);

        b=new Button("place order");
        b.setBounds(50,300,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cid=tf1.getText();
                String cname=tf2.getText();
                String caddr=tf3.getText();
                String cmob=tf4.getText();
                String res=c.placeorder(cid,cname,caddr,cmob);
                lq.setText(res);
                displaydata();
            }
        });
        b1=new Button("receive product");
        b1.setBounds(150,300,100,30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=c.receiveproduct();
                lq.setText(res);
                displaydata();
            }
        });
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    Customer c=new Customer();
    public void displaydata()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("customer id : " + c.getCid() + "\n");
        sb.append("customer name : " + c.getCname() + "\n");
        sb.append("customer address : " + c.getC_addr() + "\n");
        sb.append("customer mobile: " + c.getC_mob() + "\n");
        ta.setText(sb.toString());
    }

    public static void main(String[] args)
    {
        CustomerForm c1=new CustomerForm();
    }
}

