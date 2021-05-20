import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDesktopPaneEx2 extends JFrame {
    MenuBar mb=new MenuBar();
    Menu m1=new Menu("file");
    MenuItem mit = new MenuItem("supplier form");
    MenuItem mi1 = new MenuItem("product form");
    JInternalFrame frame1,frame2;
    private final JDesktopPane desktopPane=new JDesktopPane();

    public JDesktopPaneEx2(){
        m1.add(mit);
        m1.add(mi1);
        mb.add(m1);

        this.setMenuBar(mb);
        mit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(true);
            }
        });

        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(true);
            }
        });

        frame1 = new JInternalFrame("shop", true, true, true, true);
        frame1.setMinimumSize(new Dimension(300, 300));
        JLabel l1 = new JLabel("Enter supplier details");
        l1.setBounds(50, 10, 250, 30);
        frame1.add(l1);

        JLabel l2=new JLabel("supplier id");
        l2.setBounds(10,120,100,20);
        frame1.add(l2);
        JTextField tf1=new JTextField();
        tf1.setBounds(130,120,100,20);
        frame1.add(tf1);

        JLabel l3=new JLabel("supplier name");
        l3.setBounds(10,170,100,20);
        frame1.add(l3);
        JTextField tf2=new JTextField();
        tf2.setBounds(120,170,100,20);
        frame1.add(tf2);

        JLabel l4=new JLabel("supplier address ");
        l4.setBounds(10,210,100,20);
        frame1.add(l4);
        JTextField tf3=new JTextField();
        tf3.setBounds(120,200,100,20);
        frame1.add(tf3);

        JLabel l5=new JLabel("P name");
        l5.setBounds(10,250,100,20);
        frame1.add(l5);
        JTextField tf4=new JTextField();
        tf4.setBounds(120,250,100,20);
        frame1.add(tf4);

        JLabel l6=new JLabel("CP");
        l6.setBounds(10,300,100,20);
        frame1.add(l6);
        JTextField tf5=new JTextField();
        tf5.setBounds(120,300,100,20);
        frame1.add(tf5);

        JLabel l7=new JLabel("Pid");
        l7.setBounds(10,350,100,20);
        frame1.add(l7);
        JTextField tf6=new JTextField();
        tf6.setBounds(120,350,100,20);
        frame1.add(tf6);

        JLabel lq=new JLabel("info");
        lq.setBounds(10,450,650,50);
        frame1.add(lq);
        JTextArea ta=new JTextArea();
        ta.setBounds(10,500,400,400);
        frame1.add(ta);

        JButton b=new JButton("Add supplier");
        b.setBounds(150,420,100,30);
        frame1.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sid="\n"+tf1.getText();
                String sname="\n"+tf2.getText();
                String saddr="\n"+tf3.getText();
                String pName="\n"+tf4.getText();
                float CP=Float.parseFloat(tf5.getText());
                String cp="\n cp : " +String.valueOf(CP);
                String Pid="\n"+tf6.getText();
                String res=s.addsupplier(sid,sname,saddr,pName,CP,Pid);
                try {
                    FileOutputStream fout=new FileOutputStream("H://supplier.txt");
                    byte[] b=sid.getBytes();
                    fout.write(b);
                    b=sname.getBytes();
                    fout.write(b);
                    b=saddr.getBytes();
                    fout.write(b);
                    b=pName.getBytes();
                    fout.write(b);
                    b=cp.getBytes();
                    fout.write(b);
                    b=Pid.getBytes();
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

        JButton b1=new JButton("Remove supplier");
        b1.setBounds(300,420,100,30);
        frame1.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=s.removesupplier();
                lq.setText(res);
                ta.setText("");
            }
        });

        JButton b2=new JButton("update supplier");
        b2.setBounds(400,420,100,30);
        frame1.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=s.updatesupplier();
                lq.setText(res);
                String sb = new String();
                sb = displaydata();
                ta.setText(sb.toString());
            }
        });

        JButton b3=new JButton("supplied product");
        b3.setBounds(500,420,100,30);
        frame1.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=s.suppliedproduct();
                lq.setText(res);
                String sb = new String();
                sb = displaydata();
                ta.setText(sb.toString());
            }
        });

        JButton b14=new JButton("Read ");
        b14.setBounds(600,420,100,30);
        frame1.add(b14);
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream fin=new FileInputStream("H://supplier.txt");
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
    Supplier11 s=new Supplier11();
    public String  displaydata()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("supplier id : " + s.getSup_id() + "\n");
        sb.append("supplier name : " + s.getSup_name() + "\n");
        sb.append("supplier address : " + s.getSup_address() + "\n");
        sb.append("product name : " + s.getPname() + "\n");
        sb.append("CP: " + s.getCp() + "\n");
        sb.append("Pid : " + s.getPid() + "\n");
        sb.toString();
        return String.valueOf(sb);
    }

    {

        frame2 = new JInternalFrame("product", true, true, true, true);
        frame2.setMinimumSize(new Dimension(300, 300));
        JLabel l2 = new JLabel("Enter product details");
        l2.setBounds(50, 10, 250, 30);
        frame2.add(l2);

        JLabel l21 = new JLabel("product id");
        l21.setBounds(10, 120, 100, 20);
        frame2.add(l21);
        JTextField tf21 = new JTextField();
        tf21.setBounds(130, 120, 100, 20);
        frame2.add(tf21);

        JLabel l22 = new JLabel("product name");
        l22.setBounds(10, 170, 100, 20);
        frame2.add(l22);
        JTextField tf22 = new JTextField();
        tf22.setBounds(120, 170, 100, 20);
        frame2.add(tf22);

        JLabel l23 = new JLabel("product qty");
        l23.setBounds(10, 210, 100, 20);
        frame2.add(l23);
        JTextField tf23 = new JTextField();
        tf23.setBounds(120, 200, 100, 20);
        frame2.add(tf23);

        JLabel l24 = new JLabel("Batch name");
        l24.setBounds(10, 250, 100, 20);
        frame2.add(l24);
        JTextField tf24 = new JTextField();
        tf24.setBounds(120, 250, 100, 20);
        frame2.add(tf24);

        JLabel l25 = new JLabel("SP");
        l25.setBounds(10, 300, 100, 20);
        frame2.add(l25);
        JTextField tf25 = new JTextField();
        tf25.setBounds(120, 300, 100, 20);
        frame2.add(tf25);

        JLabel l26 = new JLabel("mfg date");
        l26.setBounds(10, 350, 100, 20);
        frame2.add(l26);
        JTextField tf26 = new JTextField();
        tf26.setBounds(120, 350, 100, 20);
        frame2.add(tf26);


        JLabel l27 = new JLabel("exp date");
        l27.setBounds(10, 400, 100, 20);
        frame2.add(l27);
        JTextField tf27 = new JTextField();
        tf27.setBounds(120, 400, 100, 20);
        frame2.add(tf27);

        JLabel lq1 = new JLabel("info");
        lq1.setBounds(10, 450, 650, 50);
        frame2.add(lq1);
        JTextArea ta1 = new JTextArea();
        ta1.setBounds(10, 500, 300, 300);
        frame2.add(ta1);

        JButton b4 = new JButton("Add Product");
        b4.setBounds(150, 420, 100, 30);
        frame2.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pid = tf21.getText();
                String p_name = tf22.getText();
                String p_qty = tf23.getText();
                String b_name = tf24.getText();
                float s_p =Float.parseFloat( tf25.getText());
                String sp="\nsp : " +String.valueOf(s_p);
                int mfG_date = Integer.parseInt(tf26.getText());
                String mf="\nmf : " +String.valueOf(mfG_date);
                int ex_date =Integer.parseInt( tf27.getText());
                String ex="\nex : " +String.valueOf(ex_date);
                String res1 = p.addproduct(pid, p_name, p_qty, b_name, s_p, mfG_date, ex_date);
                try {
                    FileOutputStream fout1=new FileOutputStream("H://product.txt");
                    byte[] b1=pid.getBytes();
                    fout1.write(b1);
                    b1=p_name.getBytes();
                    fout1.write(b1);
                    b1=p_qty.getBytes();
                    fout1.write(b1);
                    b1=b_name.getBytes();
                    fout1.write(b1);
                    b1=sp.getBytes();
                    fout1.write(b1);
                    b1=mf.getBytes();
                    fout1.write(b1);
                    b1=ex.getBytes();
                    fout1.write(b1);
                    fout1.close();
                }catch (Exception ee)
                {

                }
                lq1.setText(res1);
                lq1.setText(res1);
                String sb1 = new String();
                sb1 = displaydata1();
                ta1.setText(sb1.toString());
            }
        });

        JButton b5 = new JButton("Remove product");
        b5.setBounds(300, 420, 100, 30);
        frame2.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res1 = p.removeproduct();
                lq1.setText(res1);
                ta1.setText("");
            }
        });

        JButton b6 = new JButton("order product");
        b6.setBounds(400, 420, 100, 30);
        frame2.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res1 = p.orderproduct();
                lq1.setText(res1);
                lq1.setText(res1);
                String sb1 = new String();
                sb1 = displaydata1();
                ta1.setText(sb1.toString());
            }
        });

        JButton b7 = new JButton("update product");
        b7.setBounds(500, 420, 100, 30);
        frame2.add(b7);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res1 = p.updateproduct();
                lq1.setText(res1);
                lq1.setText(res1);
                String sb1 = new String();
                sb1 = displaydata1();
                ta1.setText(sb1.toString());
            }
        });

        JButton b8 = new JButton("Read product");
        b8.setBounds(600, 420, 100, 30);
        frame2.add(b8);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream fin1=new FileInputStream("H://product.txt");
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
        frame2.setSize(700, 700);
        desktopPane.add(frame2);
    }
    Product11 p=new Product11();
    public String  displaydata1()
    {
        StringBuilder sb1=new StringBuilder();
        sb1.append("product id : " + p.getPi_id() + "\n");
        sb1.append("product name : " + p.getP_name() + "\n");
        sb1.append("product qty : " + p.getP_qty() + "\n");
        sb1.append("batch name : " + p.getBatch_name() + "\n");
        sb1.append("sp: " + p.getSp() + "\n");
        sb1.append("mfg date : " + p.getMfg_dt() + "\n");
        sb1.append("exp date : " + p.getExp_dt() + "\n");
        sb1.toString();
        return String.valueOf(sb1);
    }

    {
        this.add(desktopPane,BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(600,600));
    }

    public static void main(String[] args) {
        JDesktopPaneEx2 frame=new JDesktopPaneEx2();
        frame.pack();
        frame.setVisible(true);
    }

}
