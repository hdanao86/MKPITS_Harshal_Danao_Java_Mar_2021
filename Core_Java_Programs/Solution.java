//java Program to create a simple JInternalFrame

import javax.swing.*;

public class Solution extends JFrame {
    //frame
    static JFrame f;

    //label to display text
    static JLabel l;

    //main class
    public static void main(String[] args) {
        //create a new frame to
        f=new JFrame("frame");

        //create a internal frame
        JInternalFrame In=new JInternalFrame();

        //set the titel of the frame
        In.setTitle("InternalFrame");

        //crate a button

        JButton b=new JButton("Button");

        //create a label to display text

        l=new JLabel("This is a JInternal Frame");

        //crate a panel

        JPanel p=new JPanel();

        //add label and button to panel
        p.add(l);
        p.add(b);

        //set visibility to internal frame

        In.setVisible(true);
        //add paenl to internal frame

        In.add(p);

        //add internal frame to frame

        f.add(In);

        //set the size of the frame
        f.setSize(300,300);
        f.show();
    }
}
