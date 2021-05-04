//Java AWT CheckboxGroup Example with ItemListener

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checkboxgroupex3 {
    Checkboxgroupex3()
    {
        Frame f=new Frame("checkbox Example");
        final Label l=new Label();
        l.setAlignment(l.CENTER);
        l.setSize(400,100);
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox chekbox1=new Checkbox("c++",cbg,false);
        chekbox1.setBounds(100,100,50,50);
        Checkbox checkbox2=new Checkbox("java",cbg,true);
        checkbox2.setBounds(100,150,50,50);
        f.add(chekbox1);
        f.add(checkbox2);
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        chekbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("c++ checkbox : checked ");
            }
        });
        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("java checkbox : checked ");
            }
        });
    }

    public static void main(String[] args) {
        Checkboxgroupex3 c=new Checkboxgroupex3();
    }
}
