import com.sun.xml.internal.bind.v2.runtime.ClassBeanInfoImpl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AwtExample2 {
    AwtExample2(){
    Frame f=new Frame("checkbox Example");
    final Label l=new Label("capital of maharashtra : ");
        l.setAlignment(l.CENTER);
        l.setSize(400,100);
        l.setBounds(10,110,200,30);
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox chekbox1=new Checkbox("nagpur",cbg,false);
        chekbox1.setBounds(180,100,70,50);
    Checkbox checkbox2=new Checkbox("mumbai",cbg,true);
        checkbox2.setBounds(250,100,70,50);
        f.add(chekbox1);
        f.add(checkbox2);
        f.add(l);
        Checkbox chekbox3=new Checkbox("delhi",cbg,false);
        chekbox3.setBounds(180,200,70,50);
        Checkbox checkbox4=new Checkbox("mumbai",cbg,true);
        checkbox4.setBounds(250,200,70,50);
        final Label l2=new Label("capital of india : ");
        l2.setAlignment(l2.CENTER);
        l2.setSize(400,100);
        l2.setBounds(10,210,200,30);
        f.add(chekbox3);
        f.add(checkbox4);
        f.add(l2);

        Label lq=new Label("info ");
        lq.setBounds(10,300,300,50);
        f.add(lq);


        Button b=new Button("result");
        b.setBounds(100,260,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                if (checkbox2.getState()==true)
                    sb.append(" capital of maharashtra : nagpur ");
                if (checkbox2.getState()==true)
                    sb.append(" capital of maharashtra : mumbai ");
                lq.setText(sb.toString());
                if (chekbox3.getState()==true)
                    sb.append(" capital of india : delhi ");
                if (checkbox4.getState()==true)
                    sb.append(" capital of india : mumbai ");
                lq.setText(sb.toString());
            }
        });

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        chekbox1.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            l.setText("nagpur checkbox : checked ");
        }
    });
        checkbox2.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            l.setText("mumbai checkbox : checked ");
        }
    });
        chekbox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("delhi checkbox : checked ");
            }
        });
        checkbox4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("mumbai checkbox : checked ");
            }
        });


}

    public static void main(String[] args) {
        AwtExample2 a=new AwtExample2();
    }
}
