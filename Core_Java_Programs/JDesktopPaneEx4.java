import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDesktopPaneEx4 extends JFrame {
    MenuBar mb = new MenuBar();
    Menu m1 = new Menu("file");
    MenuItem mi1 = new MenuItem("customer form");
    MenuItem mi2 = new MenuItem("Billing form");
    JInternalFrame frame1, frame2;
    private final JDesktopPane desktopPane = new JDesktopPane();
    public JDesktopPaneEx4() {
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
        JLabel l1 = new JLabel("Enter Customer details");
        l1.setBounds(50, 10, 250, 30);
        frame1.add(l1);

        JLabel l2 = new JLabel("customer id");
        l2.setBounds(10, 120, 100, 20);
        frame1.add(l2);
        JTextField tf1 = new JTextField();
        tf1.setBounds(130, 120, 100, 20);
        frame1.add(tf1);

        JLabel l3 = new JLabel("customer name");
        l3.setBounds(10, 170, 100, 20);
        frame1.add(l3);
        JTextField tf2 = new JTextField();
        tf2.setBounds(120, 170, 100, 20);
        frame1.add(tf2);

        JLabel l4 = new JLabel("customer addr");
        l4.setBounds(10, 210, 100, 20);
        frame1.add(l4);
        JTextField tf3 = new JTextField();
        tf3.setBounds(120, 210, 100, 20);
        frame1.add(tf3);

        JLabel l5 = new JLabel("customer mob");
        l5.setBounds(10, 250, 100, 20);
        frame1.add(l5);
        JTextField tf4 = new JTextField();
        tf4.setBounds(120, 250, 100, 20);
        frame1.add(tf4);

        JLabel lq = new JLabel("info");
        lq.setBounds(10, 350, 650, 50);
        frame1.add(lq);
        JTextArea ta = new JTextArea();
        ta.setBounds(10, 400, 300, 200);
        frame1.add(ta);

        JButton b = new JButton("place order");
        b.setBounds(50, 300, 100, 30);
        frame1.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cid = tf1.getText();
                String cname = tf2.getText();
                String caddr = tf3.getText();
                int cmob =Integer.parseInt( tf4.getText());
                String cm="\ncm : " +String.valueOf(cmob);
                String res = c.placeorder(cid, cname, caddr, cmob);
                try {
                 FileOutputStream fout=new FileOutputStream("H://customer.txt");
                 byte[] b=cid.getBytes();
                 fout.write(b);
                 b=cname.getBytes();
                 fout.write(b);
                    b=caddr.getBytes();
                    fout.write(b);
                    b=cm.getBytes();
                    fout.write(b);
                    fout.close();
                }catch (Exception ee)
                {

                }
                lq.setText(res);
                String sb = new String();
                sb = displaydata();
                ta.setText(sb.toString());
            }
        });
        JButton b1 = new JButton("receive product");
        b1.setBounds(150, 300, 100, 30);
        frame1.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = c.receiveproduct();
                lq.setText(res);
                String sb = new String();
                sb = displaydata();
                ta.setText(sb.toString());
            }
        });

        JButton b13 = new JButton("Read");
        b13.setBounds(300, 300, 100, 30);
        frame1.add(b13);
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream fin= new FileInputStream("H://order.txt");
                    int i=0;
                    StringBuilder sb=new StringBuilder();
                    while ((i=fin.read())!=-1)
                    {
                        sb.append((char)i);
                    }
                    fin.close();
                }catch (Exception ee)
                {

                }
            }
        });

        frame1.setLayout(null);
        frame1.setSize(800, 700);
        desktopPane.add(frame1);
    }

    Customer11 c = new Customer11();

    public String displaydata() {
        StringBuilder sb = new StringBuilder();
        sb.append("customer id : " + c.getCid() + "\n");
        sb.append("customer name : " + c.getCname() + "\n");
        sb.append("customer address : " + c.getC_addr() + "\n");
        sb.append("customer mobile: " + c.getC_mob() + "\n");
        sb.toString();
        return String.valueOf(sb);
    }

    {

        frame2 = new JInternalFrame("Billing", true, true, true, true);
        frame2.setMinimumSize(new Dimension(300, 300));
        JLabel l21 = new JLabel("Enter Billing details");
        l21.setBounds(50, 10, 250, 30);
        frame2.add(l21);

        JLabel l22 = new JLabel("billing id");
        l22.setBounds(10, 120, 100, 20);
        frame2.add(l22);
        JTextField tf21 = new JTextField();
        tf21.setBounds(130, 120, 100, 20);
        frame2.add(tf21);

        JLabel l23 = new JLabel("product id");
        l23.setBounds(10, 170, 100, 20);
        frame2.add(l23);
        JTextField tf22 = new JTextField();
        tf22.setBounds(120, 170, 100, 20);
        frame2.add(tf22);

        JLabel l24 = new JLabel("customer id");
        l24.setBounds(10, 210, 100, 20);
        frame2.add(l24);
        JTextField tf23 = new JTextField();
        tf23.setBounds(120, 200, 100, 20);
        frame2.add(tf23);

        JLabel l25 = new JLabel("order id");
        l25.setBounds(10, 250, 100, 20);
        frame2.add(l25);
        JTextField tf24 = new JTextField();
        tf24.setBounds(120, 250, 100, 20);
        frame2.add(tf24);

        JLabel l26 = new JLabel("product name");
        l26.setBounds(10, 300, 100, 20);
        frame2.add(l26);
        JTextField tf25 = new JTextField();
        tf25.setBounds(120, 300, 100, 20);
        frame2.add(tf25);

        JLabel l27 = new JLabel("discount");
        l27.setBounds(10, 350, 100, 20);
        frame2.add(l27);
        JTextField tf26 = new JTextField();
        tf26.setBounds(120, 350, 100, 20);
        frame2.add(tf26);

        JLabel l28 = new JLabel("bill date");
        l28.setBounds(10, 400, 100, 20);
        frame2.add(l28);
        JTextField tf27 = new JTextField();
        tf27.setBounds(120, 400, 100, 20);
        frame2.add(tf27);

        JLabel l29 = new JLabel("total bill ");
        l29.setBounds(10, 450, 100, 20);
        frame2.add(l29);
        JTextField tf28 = new JTextField();
        tf28.setBounds(120, 450, 100, 20);
        frame2.add(tf28);

        JLabel lq1 = new JLabel("info");
        lq1.setBounds(10, 500, 650, 50);
        frame2.add(lq1);
        JTextArea ta1 = new JTextArea();
        ta1.setBounds(10, 530, 600, 600);
        frame2.add(ta1);

        JButton b2 = new JButton("calculate");
        b2.setBounds(150, 480, 100, 30);
        frame2.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bid = tf21.getText();
                String pid = tf22.getText();
                String cid = tf23.getText();
                String oid = tf24.getText();
                String pname = tf25.getText();
                float discount = Float.parseFloat(tf26.getText());
                String Dis="\n discount : " +String.valueOf(discount);
                int billdate =Integer.parseInt( tf27.getText());
                String Bildt="\n billdate : " +String.valueOf(billdate);
                float totalbill = Float.parseFloat(tf28.getText());
                String Totbil="total bill : " + String.valueOf(totalbill);
                String res1 = bi.calculate(bid, pid, cid, oid, pname, discount, billdate, totalbill);
                try {
                    FileOutputStream fout1=new FileOutputStream("H://Billing.txt");
                    byte[] b1=bid.getBytes();
                    fout1.write(b1);
                    b1=pid.getBytes();
                    fout1.write(b1);
                    b1=cid.getBytes();
                    fout1.write(b1);
                    b1=oid.getBytes();
                    fout1.write(b1);
                    b1=pname.getBytes();
                    fout1.write(b1);
                    b1=Dis.getBytes();
                    fout1.write(b1);
                    b1=Bildt.getBytes();
                    fout1.write(b1);
                    b1=Totbil.getBytes();
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
        JButton b3 = new JButton("payment");
        b3.setBounds(300, 480, 100, 30);
        frame2.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res1 = bi.payment();
                lq1.setText(res1);
                String sb1=new String();
                sb1=displaydata1();
                ta1.setText(sb1.toString());
            }
        });

        JButton b4 = new JButton("Read");
        b4.setBounds(400, 480, 100, 30);
        frame2.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream fin1=new FileInputStream("H://Billing.txt");
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

    Billing11 bi=new Billing11();
    public String  displaydata1()
    {
        StringBuilder sb1=new StringBuilder();
        sb1.append("bill id : " + bi.getBid() + "\n");
        sb1.append("product id : " + bi.getP_id() + "\n");
        sb1.append("customer id : " + bi.getC_id() + "\n");
        sb1.append("order id : " + bi.getO_id() + "\n");
        sb1.append("pname : " + bi.getPname() + "\n");
        sb1.append("discount : " + bi.getDiscount() + "\n");
        sb1.append("bill date : " + bi.getBill_dt() + "\n");
        sb1.append("total bill : " + bi.getTotal_bill() + "\n");
        sb1.toString();
        return String.valueOf(sb1);
    }
    {
        this.add(desktopPane, BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(600, 600));
    }


    public static void main(String[] args) {
        JDesktopPaneEx4 frame = new JDesktopPaneEx4();
        frame.pack();
        frame.setVisible(true);
    }
}