//create a swing form to insert update delete and search supplier table.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class supplierform extends JFrame {
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1,b2,b3,b4;
    Connection con=null;
    Statement stmt=null;
    public supplierform() {
        l1 = new JLabel("sup_id");
        l1.setBounds(20, 50, 200, 20);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(230, 50, 200, 20);
        add(t1);

        l2 = new JLabel("sup_name");
        l2.setBounds(20, 100, 200, 20);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(230, 100, 200, 20);
        add(t2);

        l3 = new JLabel("sup_addr");
        l3.setBounds(20, 150, 200, 20);
        add(l3);
        t3 = new JTextField();
        t3.setBounds(230, 150, 200, 20);
        add(t3);

        l4 = new JLabel("pname");
        l4.setBounds(20, 200, 200, 20);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(230, 200, 200, 20);
        add(t4);

        l5 = new JLabel("CP");
        l5.setBounds(20, 250, 200, 20);
        add(l5);
        t5 = new JTextField();
        t5.setBounds(230, 250, 200, 20);
        add(t5);

        l6 = new JLabel("pid");
        l6.setBounds(20, 300, 200, 20);
        add(l6);
        t6 = new JTextField();
        t6.setBounds(230, 300, 200, 20);
        add(t6);

        l7 = new JLabel("status");
        l7.setBounds(10, 400, 400, 20);
        add(l7);

        b1=new JButton("save");
        b1.setBounds(100,350,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_management","root","");
                    stmt=con.createStatement();
                    String str="insert into supplier values ('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"',"+t5.getText()+",'"+t6.getText()+"')";
                    stmt.executeUpdate(str);
                    con.close();
                    l7.setText("record inserted successfully");

                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");



                }catch (Exception ee)
                {
                    l7.setText(ee.toString());
                }
            }
        });
        add(b1);

        b2=new JButton("update");
        b2.setBounds(220,350,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_management","root","");
                    stmt=con.createStatement();
                    String str="update supplier set sup_name='"+t2.getText()+"',sup_addr='"+t3.getText()+"',pname='"+t4.getText()+"',cP="+t5.getText()+",pid='"+t6.getText()+"' where sup_id='"+t1.getText()+"'";
                    stmt.executeUpdate(str);
                    con.close();
                    l7.setText("record updated successfully");

                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");



                }catch (Exception ee)
                {
                    l7.setText(ee.toString());
                }
            }
        });
        add(b2);

        setSize(600,500);
        setTitle("supplier entry form");
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        supplierform s=new supplierform();
    }
}
