import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDesktopPaneEx extends JFrame {
    // JTextArea ta;
    MenuBar mb = new MenuBar();
    Menu m1 = new Menu("file");
    Menu m2 = new Menu("task");
    Menu sm1 = new Menu("tasks");
    MenuItem me = new MenuItem("exit");
    MenuItem mit = new MenuItem("product entry");
    MenuItem mi1 = new MenuItem("shop form");
    MenuItem mi2 = new MenuItem("stock form");
    JInternalFrame frame1, frame2;
    JTextArea ta;
    private final JDesktopPane desktopPane = new JDesktopPane();

    public JDesktopPaneEx() {
        m1.add(mi1);
        m1.add(mi2);
        sm1.add(mit);
        m1.add(sm1);
        mb.add(m1);

        m2.add(me);
        me.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello");
                System.exit(0);
            }
        });
        mb.add(m2);
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
        JLabel l1 = new JLabel("Enter shop deatils");
        l1.setBounds(50, 10, 250, 30);

        JLabel l3 = new JLabel("shop no");
        l3.setBounds(10, 120, 100, 20);
        frame1.add(l3);
        JTextField tf = new JTextField();
        tf.setBounds(130, 120, 100, 20);
        frame1.add(tf);

        JLabel l4 = new JLabel("city");
        l4.setBounds(10, 170, 100, 20);
        frame1.add(l4);
        Choice c = new Choice();
        c.setBounds(130, 170, 75, 75);
        c.add("mumbai");
        c.add("nagpur");
        c.add("pune");
        c.add("hydrabad");
        c.add("banglore");
        frame1.add(c);

        JLabel l5 = new JLabel("owner");
        l5.setBounds(10, 210, 100, 20);
        frame1.add(l5);
        JTextField tf1 = new JTextField();
        tf1.setBounds(120, 200, 100, 20);
        frame1.add(tf1);

        JLabel l6 = new JLabel("Address");
        l6.setBounds(10, 250, 100, 20);
        frame1.add(l6);
        JTextField tf2 = new JTextField();
        tf2.setBounds(120, 250, 100, 20);
        frame1.add(tf2);

        JLabel lq = new JLabel("info");
        lq.setBounds(10, 350, 650, 50);
        frame1.add(lq);
        JTextArea ta = new JTextArea();
        ta.setBounds(10, 400, 400, 300);
        frame1.add(ta);

        JButton b = new JButton("Add shop");
        b.setBounds(150, 300, 100, 30);
        frame1.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sn ="" +tf.getText();
                String ct ="\n" +c.getItem(c.getSelectedIndex());
                String ow ="\n" +tf1.getText();
                String ad ="\n" +tf2.getText();
                String res = s.addShop(sn, ct, ow, ad);
                try {
                 FileWriter fout=new FileWriter("H://shop.txt");
                // byte[] b= sn.getBytes();
                 fout.write(sn);
                 //b=ct.getBytes();
                 fout.write(ct);
                 //b=ow.getBytes();
                 fout.write(ow);
                // b=ad.getBytes();
                 fout.write(ad);
                 fout.close();
                }catch (Exception ee)
                {
                    System.out.println(ee);
                }
                lq.setText(res);
                String sb = new String();
                sb = displaydata();
                ta.setText(sb.toString());

            }
        });

        JButton b1 = new JButton("Remove shop");
        b1.setBounds(300, 300, 100, 30);
        frame1.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = s.removeShop();
                lq.setText(res);
                ta.setText("");
            }
        });

        JButton b2 = new JButton("Read shop");
        b2.setBounds(450, 300, 100, 30);
        frame1.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream fin=new FileInputStream("H://shop.txt");
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

        frame1.add(l1);
        frame1.setLayout(null);
        frame1.setSize(600, 600);
        desktopPane.add(frame1);
    }

        Shop1 s = new Shop1();

        public String displaydata() {
            StringBuilder sb = new StringBuilder();
            sb.append("shop no : " + s.getshop_no() + "\n");
            sb.append("city : " + s.getcity() + "\n");
            sb.append("owner : " + s.getowner() + "\n");
            sb.append("address : " + s.getAddress() + "\n");
            sb.toString();
            return String.valueOf(sb);
        }
    {

        frame2 = new JInternalFrame("stock", true, true, true, true);
        frame2.setMinimumSize(new Dimension(300, 300));
        JLabel l2 = new JLabel("Enter stock details");
        l2.setBounds(50, 10, 250, 30);
        frame2.add(l2);

        JLabel l21 = new JLabel("stock id");
        l21.setBounds(10, 120, 100, 20);
        frame2.add(l21);
        JTextField tf21 = new JTextField();
        tf21.setBounds(130, 120, 100, 20);
        frame2.add(tf21);

        JLabel l22 = new JLabel("product id");
        l22.setBounds(10, 170, 100, 20);
        frame2.add(l22);
        JTextField tf22 = new JTextField();
        tf22.setBounds(120, 170, 100, 20);
        frame2.add(tf22);

        JLabel l23 = new JLabel("stk disc ");
        l23.setBounds(10, 210, 100, 20);
        frame2.add(l23);
        JTextField tf23 = new JTextField();
        tf23.setBounds(120, 200, 100, 20);
        frame2.add(tf23);

        JLabel l24 = new JLabel("stk qty");
        l24.setBounds(10, 250, 100, 20);
        frame2.add(l24);
        JTextField tf24 = new JTextField();
        tf24.setBounds(120, 250, 100, 20);
        frame2.add(tf24);

        JLabel l25 = new JLabel("Date");
        l25.setBounds(10, 300, 100, 20);
        frame2.add(l25);
        JTextField tf25 = new JTextField();
        tf25.setBounds(120, 300, 100, 20);
        frame2.add(tf25);

        JLabel lq1 = new JLabel("info");
        lq1.setBounds(10, 400, 650, 50);
        frame2.add(lq1);
        JTextArea ta1 = new JTextArea();
        ta1.setBounds(10, 450, 300, 100);
        frame2.add(ta1);

        JButton b3 = new JButton("Availability");
        b3.setBounds(150, 360, 100, 30);
        frame2.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sid ="\n sid" + tf21.getText();
                String pid = "\n pid" +tf22.getText();
                String stkdisc = "\nStckdisc" +tf23.getText();
                int stkqty =Integer.parseInt(tf24.getText());
                String  sqty="\nstockqty " + String.valueOf(stkqty);
                int date = Integer.parseInt(tf25.getText());
                String dt="\ndate : " + String.valueOf(date);
                String res1 = s1.availability(sid, pid, stkdisc, stkqty, date);
                try {
                    FileOutputStream fout1=new FileOutputStream("H://stock.txt");
                    byte[] b1=sid.getBytes();
                    fout1.write(b1);
                    b1=pid.getBytes();
                    fout1.write(b1);
                    b1=stkdisc.getBytes();
                    fout1.write(b1);
                    b1=sqty.getBytes();
                    fout1.write(b1);
                    b1=dt.getBytes();
                    fout1.write(b1);
                    fout1.close();
                }catch (Exception ee)
                {

                }
                lq1.setText(res1);
                String sb1 = new String();
                sb1 = displaydata1();
                ta1.setText(sb1.toString());
            }
        });

        JButton b4 = new JButton("Add stock");
        b4.setBounds(270, 360, 80, 30);
        frame2.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res1 = s1.addstock();
                lq1.setText(res1);
                String sb1 = new String();
                sb1 = displaydata1();
                ta1.setText(sb1.toString());
            }
        });

        JButton b5 = new JButton("Remove stock");
        b5.setBounds(390, 360, 80, 30);
        frame2.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res1 = s1.removestock();
                lq1.setText(res1);
                ta1.setText("");
            }
        });

        JButton b6 = new JButton("update stock");
        b6.setBounds(500, 360, 80, 30);
        frame2.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res1 = s1.updatestock();
                lq1.setText(res1);
                String sb1 = new String();
                sb1 = displaydata1();
                ta1.setText(sb1.toString());
            }
        });

        JButton b7=new JButton("Read stock");
        b7.setBounds(610,360,80,30);
        frame2.add(b7);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream fin1=new FileInputStream("H://stock.txt");
                    int i=0;
                    StringBuilder sb2=new StringBuilder();
                    while ((i=fin1.read())!=-1)
                    {
                        sb2.append((char)i);
                    }
                    fin1.close();
                    ta.setText(sb2.toString());
                }catch (Exception ee)
                {

                }
            }
        });

        frame2.setLayout(null);
        frame2.setSize(700, 700);
        desktopPane.add(frame2);

    }



    Stock11 s1=new Stock11();
    public String  displaydata1()
    {
        StringBuilder sb1=new StringBuilder();
        sb1.append("stock id : " + s1.getS_id() + "\n");
        sb1.append("pid : " + s1.getP_id() + "\n");
        sb1.append("stock disc : " + s1.getStk_disc() + "\n");
        sb1.append("stock qty : " + s1.getStk_qty() + "\n");
        sb1.append("stock date  : " + s1.getDate() + "\n");
        sb1.toString();
        return String.valueOf(sb1);
    }


    {
        this.add(desktopPane,BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(600,600));
}

    public static void main(String[] args) {
        JDesktopPaneEx frame = new JDesktopPaneEx();
        frame.pack();
        frame.setVisible(true);
    }
}
