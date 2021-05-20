// java Program to create multiple internal frames

import javax.swing.*;
import java.awt.*;

public class SolutionMultipleFrames extends JFrame {
    static JFrame f;

    static JLabel l,l1;

    public static void main(String[] args) {
        f=new JFrame("frame");
        //setlayout of frame
        f.setLayout(new FlowLayout());

        //create 1st internal frame
        JInternalFrame In=new JInternalFrame("frame 1",true,true,true,true);

        //crate 2nd internal frame
        JInternalFrame In1=new JInternalFrame("frame 2",true,true,true,true);


        JButton b1=new JButton("button 1");
        JButton b2=new JButton("button 2");

        l=new JLabel("This is a jinternalframe 1");
        l1=new JLabel("This is a jinternalframe 2");

        //crate a panel
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();

        //add label and button to panel
        p1.add(l);
        p1.add(b1);
        p2.add(l1);
        p2.add(b2);

        //set visiblity in internalframe
        In.setVisible(true);
        In1.setVisible(true);

        //add panel to internal frame
        In.add(p1);
        In1.add(p2);
        //add internal frame to frame
        f.add(In);
        f.add(In1);

        f.setSize(300,300);
        f.show();

    }
}
