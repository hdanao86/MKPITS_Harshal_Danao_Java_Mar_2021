//Java AWT Checkbox Example with ItemListener

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxItemlistener {
    CheckboxItemlistener(){
        final Label l=new Label();
        Frame f=new Frame("checkbox Example");
        l.setAlignment(l.CENTER);
        l.setSize(400,100);
        Checkbox chekbox1=new Checkbox("C++");
        chekbox1.setBounds(100,100,50,50);
        Checkbox chkbox2=new Checkbox("Java");
        chkbox2.setBounds(100,150,50,50);
        f.add(chekbox1);
        f.add(chkbox2);
        f.add(l);
        chekbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("C++ checkbox : " +(e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        chkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("Java checkbox : " +(e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        CheckboxItemlistener c=new CheckboxItemlistener();
    }
}
