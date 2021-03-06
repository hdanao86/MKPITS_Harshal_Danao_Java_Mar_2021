//create a login form and check the credentials from the registerform table .
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class JdbcLoginForm extends JFrame{
    public JdbcLoginForm(){
        JLabel l11=new JLabel("Login form");
        l11.setBounds(100,40,240,25);
        add(l11);

        JLabel l1=new JLabel("username :");
        l1.setBounds(10,80,240,30);
        add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(260,80,240,25);
        add(t1);

        JLabel l2=new JLabel("pass : ");
        l2.setBounds(10,120,240,25);
        add(l2);
        JPasswordField t2=new JPasswordField();
        //t2.setEchoChar('*');
        t2.setBounds(260,120,240,25);
        add(t2);

        JLabel l3=new JLabel("Status");
        l3.setBounds(10,400,240,25);
        add(l3);

        JButton b1=new JButton("Login");
        b1.setBounds(100,360,80,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un = t1.getText();
                String p =t2.getText();
                Connection con=null;
                Statement st=null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_management","root","");
                    st=con.createStatement();
                    String str="select * from registerform where username='"+un+"' and pass='"+p+"'";
                    ResultSet rs=st.executeQuery(str);
                    int flag=0;
                    while (rs.next()){
                        flag=1;
                    }
                    if (flag==1){
                        l3.setText("Login successfull");
                    }
                    else {
                        l3.setText("Invalid credentials,try again !" );
                    }
                    t1.setText("");
                    t2.setText("");
                    st.close();
                    con.close();
                }catch (Exception ee)
                {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        JButton b2=new JButton("reset");
        b2.setBounds(200,360,80,20);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
            }
        });
        add(b2);


        setTitle("Login Form");
        setSize(600,500);
        setLayout(null);
        setVisible(true);



    }
    static JdbcLoginForm logi=null;
    public static void main(String[] args) {
        logi=new JdbcLoginForm();
    }
}
