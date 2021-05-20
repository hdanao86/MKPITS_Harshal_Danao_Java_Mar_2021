import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class ElevatorEx {
    public static JLabel j1;
    public static JButton b;
    public static Timer timer;
    public static JButton b1,b2,b3,blight,bdoor;
    public static int tc;
    static void ElevatorEx() {
        Display dis = new Display();
        JFrame frame = new JFrame("Elevator");
        JPanel jp = new JPanel();
        jp.setBounds(10, 20, 200, 400);
        jp.setLayout(null);

        JPanel jp2 = new JPanel();
        jp2.setBounds(10, 10, 180, 80);
        jp2.setBackground(Color.lightGray);
        jp2.setLayout(null);
        j1 = new JLabel("Floor 0");
        j1.setBounds(70, 10, 150, 100);
        jp2.add(j1);
        jp.add(jp2);

        JPanel jp3 = new JPanel();
        jp3.setBounds(10, 100, 180, 80);
        jp3.setLayout(null);

        JPanel jp23 = new JPanel();
        jp23.setBounds(10, 220, 180, 140);
        jp23.setBackground(Color.yellow);
        jp23.setLayout(null);
        final JLabel bff = new JLabel("Fan");
        bff.setBounds(20, 20, 100, 30);
        final JLabel bf = new JLabel("off");
        bf.setBounds(120, 20, 100, 30);

        final JLabel bll = new JLabel("Light");
        bll.setBounds(20, 60, 100, 30);
        final JLabel bl = new JLabel("off");
        bl.setBounds(120, 60, 100, 30);

        final JLabel bdd = new JLabel("Door");
        bdd.setBounds(20, 100, 100, 30);
        final JLabel bd = new JLabel("opened");
        bd.setBounds(120, 100, 100, 30);
        jp23.add(bff);
        jp23.add(bf);
        jp23.add(bll);
        jp23.add(bl);
        jp23.add(bdd);
        jp23.add(bd);
        jp.add(jp23);

        JPanel jpp = new JPanel();
        jpp.setBounds(300, 20, 200, 400);
        jpp.setBackground(Color.gray);
        jpp.setLayout(null);

        b = new JButton("0");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tc = 5;
            }
        });
        b.setBounds(10, 300, 80, 50);
        jpp.add(b);

        //door and light button

        bdoor = new JButton("Door");
        bdoor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String f = bd.getText();
                String res = null;
                if (f.equals("opened")) {
                    res = dis.setDisplay(false);
                    if (res.equals("on"))
                        bd.setText("opened");
                    else
                        bd.setText("closed");
                } else {
                    res = dis.setDisplay(true);
                    if (res.equals("on"))
                        bd.setText("opened");
                    else
                        bd.setText("closed");
                }
            }
        });

        bdoor.setBounds(10, 50, 80, 50);
        jpp.add(bdoor);

        blight = new JButton("Light");
        blight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String f = bl.getText();
                if (f.equals("off"))
                {
                    bl.setText(dis.setDisplay(true));
                }
                else
                    {
                    bl.setText(dis.setDisplay(false));
                }
            }
        });
        blight.setBounds(100, 50, 80, 50);
        jpp.add(blight);

        b1 = new JButton("1");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //  bd.setText("closed");
                //for (long i = 1;i < 100000000l; i++)

                    Timer timer = new Timer();
                    TimerTask task = new Helper(new ElevatorEx(), 1);
                    timer.schedule(task, 5000, 5000);

                // j1.setText("Floor 1");
                // bd.setText("opened");
            }
        });
        b1.setBounds(10, 200, 80, 50);
        jpp.add(b1);

        b2 = new JButton("2");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //tc = 3;
                Timer timer =new Timer();
                Helper(new ElevatorEx(),2);
                timer.schedule(task,5000,5000);

            }
        });
        b2.setBounds(100, 150, 80, 50);

        b3 = new JButton("Fan");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String f = bf.getText();
                if (f.equals("off")) {
                    bf.setText(dis.setDisplay(true));
                } else {
                    bf.setText(dis.setDisplay(false));
                }
            }
        });
        b3.setBounds(100, 300, 80, 50);
        jpp.add(b3);

        frame.add(jp);
        frame.add(jpp);

     //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);
        frame.setSize(600, 500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                ElevatorEx();
            }
        });
    }
}

































