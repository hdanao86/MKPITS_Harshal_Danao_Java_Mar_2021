import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jDesktopPaneEx3 extends JFrame {
    MenuBar mb=new MenuBar();
    Menu m1=new Menu("file");
    MenuItem mi1=new MenuItem("Employee form");
    MenuItem mi2=new MenuItem("order form");
    JInternalFrame frame1,frame2;
    private final JDesktopPane desktopPane=new JDesktopPane();
    public jDesktopPaneEx3(){
        m1.add(mi1);
        m1.add(mi2);
        mb.add(m1);
        this.setMenuBar(mb);

        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(true);
            }
        });

        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(true);
            }
        });

        frame1 = new JInternalFrame("shop", true, true, true, true);
        frame1.setMinimumSize(new Dimension(300, 300));
        JLabel l1 = new JLabel("Enter employee details");
        l1.setBounds(50, 10, 250, 30);
        frame1.add(l1);

        JLabel l2=new JLabel("employee id");
        l2.setBounds(10,120,100,20);
        frame1.add(l2);
        JTextField tf1=new JTextField();
        tf1.setBounds(130,120,100,20);
        frame1.add(tf1);

        JLabel l3=new JLabel("emp name");
        l3.setBounds(10,170,100,20);
        frame1.add(l3);
        JTextField tf2=new JTextField();
        tf2.setBounds(130,170,100,30);
        frame1.add(tf2);

        JLabel l4=new JLabel("select sex");
        l4.setBounds(10,230,120,20);
        frame1.add(l4);
        CheckboxGroup cbg1=new CheckboxGroup();
        Checkbox checkbox1=new Checkbox("male",cbg1,false);
        checkbox1.setBounds(120,230,50,50);
        Checkbox checkbox2=new Checkbox("female",cbg1,true);
        checkbox2.setBounds(180,230,100,50);
        frame1.add(checkbox1);
        frame1.add(checkbox2);

        JLabel l5=new JLabel("selct shift");
        l5.setBounds(10,300,120,20);
        frame1.add(l5);
        CheckboxGroup cbg2=new CheckboxGroup();
        Checkbox checkbox3=new Checkbox("morning",cbg2,false);
        checkbox3.setBounds(120,300,50,50);
        Checkbox checkbox4=new Checkbox("night",cbg2,true);
        checkbox4.setBounds(180,300,100,50);
        frame1.add(checkbox3);
        frame1.add(checkbox4);

        JLabel l6=new JLabel("emp address");
        l6.setBounds(10,350,100,20);
        frame1.add(l6);
        JTextField tf3=new JTextField();
        tf3.setBounds(120,350,100,20);
        frame1.add(tf3);

        JLabel l7=new JLabel("emp mobile");
        l7.setBounds(10,400,100,20);
        frame1.add(l7);
        JTextField tf4=new JTextField();
        tf4.setBounds(120,400,100,20);
        frame1.add(tf4);

        JLabel l8=new JLabel("emp salary");
        l8.setBounds(10,450,100,20);
        frame1.add(l8);
        JTextField tf5=new JTextField();
        tf5.setBounds(120,450,100,20);
        frame1.add(tf5);

        JLabel lq=new JLabel("info");
        lq.setBounds(10,480,650,50);
        frame1.add(lq);
        JTextArea ta=new JTextArea();
        ta.setBounds(10,550,500,600);
        frame1.add(ta);

        JButton b=new JButton("view product");
        b.setBounds(210,520,100,30);
        frame1.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eid=tf1.getText();
                String ename=tf2.getText();
                String empaddr=tf3.getText();
                String g=null;
                if (checkbox1.getState()==true)
                    g= "male";
                if (checkbox2.getState()==true)
                    g= "female";
                String s=null;
                if (checkbox3.getState()==true)
                    s= "morning";
                if (checkbox4.getState()==true)
                    s= "night";
                int empmob=Integer.parseInt(tf4.getText());
                String emob="\nemob : " +String.valueOf(empmob);
                float empsal=Float.parseFloat(tf5.getText());
                String esal="\nesal : " +String.valueOf(empsal);
                String res=e1.viewproduct(eid,ename,g,empsal,s,empaddr,empmob);
                try {
                 FileOutputStream fout=new FileOutputStream("H://employee.txt");
                 byte[] b=eid.getBytes();
                 fout.write(b);
                 b=ename.getBytes();
                 fout.write(b);
                    b=empaddr.getBytes();
                    fout.write(b);
                    b=g.getBytes();
                    fout.write(b);
                    b=s.getBytes();
                    fout.write(b);
                    b=emob.getBytes();
                    fout.write(b);
                    b=esal.getBytes();
                    fout.write(b);
                    fout.close();
                }catch (Exception ee)
                {

                }
                lq.setText(res);
                String sb=new String();
                sb=displaydata();
                ta.setText(sb.toString());

            }
        });

        JButton b1=new JButton("view customer");
        b1.setBounds(110,520,100,20);
        frame1.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=e1.viewcustomer();
                lq.setText(res);
                String sb=new String();
                sb=displaydata();
                ta.setText(sb.toString());
            }
        });

        JButton b2=new JButton("view supplier");
        b2.setBounds(300,520,100,20);
        frame1.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=e1.viewsupplier();
                lq.setText(res);
                String sb=new String();
                sb=displaydata();
                ta.setText(sb.toString());
            }
        });

        JButton b13=new JButton("Read ");
        b13.setBounds(400,520,100,20);
        frame1.add(b13);
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream fin=new FileInputStream("H://employee.txt");
                    int i=0;
                    StringBuilder sb=new StringBuilder();
                    while ((i=fin.read())!=-1)
                    {
                        sb.append((char)i);
                    }
                    fin.close();
                    ta.setText(sb.toString());
                }catch (Exception ee)
                {

                }
            }
        });


        frame1.setLayout(null);
        frame1.setSize(800, 700);
        desktopPane.add(frame1);
    }
    Employee121 e1=new Employee121();
    public String  displaydata(){
        StringBuilder sb=new StringBuilder();
        sb.append("emp id : " + e1.getEid() + "\n");
        sb.append("emp name : " + e1.getEname() + "\n");
        sb.append("emp sex : " + e1.getSex() + "\n");
        sb.append("emp shift : " + e1.getShift() + "\n");
        sb.append("emp addr : " + e1.getE_addr() + "\n");
        sb.append("emp mob : " + e1.getE_mob() + "\n");
        sb.append("emp salary : " + e1.getSalary() + "\n");;
        sb.toString();
        return String.valueOf(sb);
        }

    {
        frame2 = new JInternalFrame("order", true, true, true, true);
        frame2.setMinimumSize(new Dimension(300, 300));
        JLabel l21 = new JLabel("Enter order details");
        l21.setBounds(50, 10, 250, 30);
        frame2.add(l21);

        JLabel l22 = new JLabel("order id");
        l22.setBounds(10, 120, 100, 20);
        frame2.add(l22);
        JTextField tf21 = new JTextField();
        tf21.setBounds(130, 120, 100, 20);
        frame2.add(tf21);

        JLabel l23 = new JLabel("order date");
        l23.setBounds(10, 170, 100, 20);
        frame2.add(l23);
        JTextField tf22 = new JTextField();
        tf22.setBounds(120, 170, 100, 20);
        frame2.add(tf22);

        JLabel l24 = new JLabel("disc rate");
        l24.setBounds(10, 210, 100, 20);
        frame2.add(l24);
        JTextField tf23 = new JTextField();
        tf23.setBounds(120, 210, 100, 20);
        frame2.add(tf23);

        JLabel l25 = new JLabel("order price");
        l25.setBounds(10, 250, 100, 20);
        frame2.add(l25);
        JTextField tf24 = new JTextField();
        tf24.setBounds(120, 250, 100, 20);
        frame2.add(tf24);

        JLabel l26 = new JLabel("order qty");
        l26.setBounds(10, 300, 100, 20);
        frame2.add(l26);
        JTextField tf25 = new JTextField();
        tf25.setBounds(120, 300, 100, 20);
        frame2.add(tf25);

        JLabel l27 = new JLabel("order status");
        l27.setBounds(10, 350, 100, 20);
        frame2.add(l27);
        JTextField tf26 = new JTextField();
        tf26.setBounds(120, 350, 100, 20);
        frame2.add(tf26);

        JLabel lq1 = new JLabel("info");
        lq1.setBounds(10, 400, 650, 50);
        frame2.add(lq1);
        JTextArea ta1 = new JTextArea();
        ta1.setBounds(10, 500, 400, 400);
        frame2.add(ta1);

        JButton b3 = new JButton("Add order");
        b3.setBounds(20, 450, 100, 30);
        frame2.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oid = tf21.getText();
                int odate =Integer.parseInt( tf22.getText());
                String odt="\nod : " +String.valueOf(odate);
                float discrate = Float.parseFloat(tf23.getText());
                String dis="\n dis : " + String.valueOf(discrate);
                float oprice =Float.parseFloat( tf24.getText());
                String op="\nop : " +String.valueOf(oprice);
                int oqty = Integer.parseInt(tf25.getText());
                String oqt="\noqty : " +String.valueOf(oqty);
                String ostatus = tf26.getText();
                String res1 = o.addorder(oid, odate, discrate, oprice, oqty, ostatus);
                try {
                    FileOutputStream fout1=new FileOutputStream("H://order.txt");
                    byte[] b1=oid.getBytes();
                    fout1.write(b1);
                    b1=odt.getBytes();
                    fout1.write(b1);
                    b1=dis.getBytes();
                    fout1.write(b1);
                    b1=op.getBytes();
                    fout1.write(b1);
                    b1=oqt.getBytes();
                    fout1.write(b1);
                    b1=ostatus.getBytes();
                    fout1.write(b1);
                    fout1.close();
                }catch (Exception ee)
                {

                }
                lq1.setText(res1);
                String sb1=new String();
                sb1=displaydata1();
                ta1.setText(sb1.toString());
            }
        });

        JButton b4 = new JButton("Remove order");
        b4.setBounds(150, 450, 100, 30);
        frame2.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res1 = o.removeorder();
                lq1.setText(res1);
                ta1.setText("");
            }
        });
        JButton b5 = new JButton("update order");
        b5.setBounds(280, 450, 100, 30);
        frame2.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res1 = o.updateorder();
                lq1.setText(res1);
                String sb1=new String();
                sb1=displaydata1();
                ta1.setText(sb1.toString());
            }
        });

        JButton b6 = new JButton("Read order");
        b6.setBounds(390, 450, 100, 30);
        frame2.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream fin1=new FileInputStream("H://order.txt");
                    int i=0;
                    StringBuilder sb=new StringBuilder();
                    while ((i=fin1.read())!=-1)
                    {
                        sb.append((char)i);
                    }
                    fin1.close();
                    ta1.setText(sb.toString());
                }catch (Exception ee)
                {

                }
            }
        });

        frame2.setLayout(null);
        frame2.setSize(800, 700);
        desktopPane.add(frame2);
    }

    Order11 o=new Order11();
    public String  displaydata1()
    {
        StringBuilder sb1=new StringBuilder();
        sb1.append("order id  : " + o.getO_id() + "\n");
        sb1.append("order date: " + o.getO_dt() + "\n");
        sb1.append("disc rate: " + o.getDisc_rate() + "\n");
        sb1.append("order price : " + o.getO_price() + "\n");
        sb1.append("oredr qty : " + o.getO_qty() + "\n");
        sb1.append("status : " + o.getStatus() + "\n");
        sb1.toString();
        return String.valueOf(sb1);
    }

    {
        this.add(desktopPane,BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(600,600));
    }


    public static void main(String[] args) {
        jDesktopPaneEx3 frame=new jDesktopPaneEx3();
        frame.pack();
        frame.setVisible(true);
    }
}
