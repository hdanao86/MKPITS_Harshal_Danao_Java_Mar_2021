//create a registration form
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
public class JdbcRegistrationForm extends JFrame{
    JRadioButton rb1;
    JRadioButton rb2;
    ButtonGroup bg;
    JCheckBox cb1,cb2;
    JComboBox city;
    JdbcRegistrationForm()
    {
        JLabel l11=new JLabel("Register Form");
        l11.setBounds(100,20,240,25);
        add(l11);

        JLabel l1=new JLabel("Username : ");
        l1.setBounds(10,80,240,25);
        add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(260,80,240,25);
        add(t1);

        JLabel l2=new JLabel("Password");
        l2.setBounds(10,120,240,25);
        add(l2);
        JPasswordField t2=new JPasswordField();
        //t2.setEchoChar('*');
        t2.setBounds(260,120,240,25);
        add(t2);

        JLabel l3=new JLabel("Gender");
        l3.setBounds(10,160,240,25);
        add(l3);

        rb1=new JRadioButton("Male");
        rb1.setBounds(260,160,100,25);
        add(rb1);
        rb2=new JRadioButton("Female");
        rb2.setBounds(400,160,100,25);
        add(rb2);

        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JLabel l4=new JLabel("Course");
        l4.setBounds(10,200,240,25);
        add(l4);

        cb1=new JCheckBox("Java");
        cb1.setBounds(260,200,100,20);
        add(cb1);
        cb2=new JCheckBox("Mysql");
        cb2.setBounds(400,200,100,20);
        add(cb2);

        JLabel l5=new JLabel("city");
        l5.setBounds(10,240,240,25);
        add(l5);
        String[] ct={"nagpur","mumbai","delhi"};
        city=new JComboBox(ct);
        city.setBounds(260,240,100,25);
        add(city);

        JLabel l6=new JLabel("status");
        l6.setBounds(10,400,240,25);
        add(l6);

        JButton b1=new JButton("register");
        b1.setBounds(100,360,80,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un=t1.getText();
                String p=t2.getText();
                String g=null;
                if (rb1.isSelected())
                    g="Male";
                else if (rb2.isSelected())
                    g="Female";

                String course=null;
                if (cb1.isSelected())
                    course="Java";
                if (cb2.isSelected())
                    course = course + " Mysql ";
              //  if (cb1.isSelected(course)) (cb2.isSelected(course))
                //    course = course + course;



                String city1=city.getSelectedItem().toString();
                Connection con=null;
                Statement st=null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_management","root","");
                   // System.out.println("connected");
                    st=con.createStatement();
                    String str="insert into registerform (username,pass,gender,course,city) values ('"+un+"','"+p+"','"+g+"','"+course+"','"+city1+"')";
                    st.executeUpdate(str);
                    l6.setText("registered successfull");
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
        setSize(700,500);
        setTitle("Registration form");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JdbcRegistrationForm j=new JdbcRegistrationForm();
    }

}
