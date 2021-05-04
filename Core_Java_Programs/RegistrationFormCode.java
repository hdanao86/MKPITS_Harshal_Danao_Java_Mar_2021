//register form code

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationFormCode {
    Label l1,l2,l3,l4;
    TextField tf;
    //Button b;
    RegistrationFormCode()
    {
        Frame f = new Frame("checkbox group Example");
        l1=new Label("register yourself");
        l1.setBounds(150,50,100,20);
        f.add(l1);

        l2=new Label("your name ");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf=new TextField();
        tf.setBounds(130,120,100,20);
        f.add(tf);

        l3=new Label("select course ");
        l3.setBounds(10,170,100,20);
        f.add(l3);
        Checkbox chekbox1=new Checkbox("c++",false);
        chekbox1.setBounds(130,150,50,50);
        Checkbox chckbox2=new Checkbox("java",true);
        chckbox2.setBounds(200,150,50,50);
        f.add(chekbox1);
        f.add(chckbox2);

        l4=new Label("select gender ");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        CheckboxGroup cbg1=new CheckboxGroup();
        Checkbox checkboc11=new Checkbox("male",cbg1,false);
        checkboc11.setBounds(120,210,50,50);
        Checkbox checkbox22=new Checkbox("female",cbg1,true);
        checkbox22.setBounds(180,210,50,50);
        f.add(chekbox1);
        f.add(chckbox2);
        f.add(checkboc11);
        f.add(checkbox22);

        Label l41=new Label("select city ");
        l41.setBounds(10,245,100,20);
        f.add(l41);
        Choice c=new Choice();
        c.setBounds(130,260,75,75);
        c.add("mumbai");
        c.add("nagpur");
        c.add("pune");
        c.add("hydraabad");
        c.add("banglore");
        f.add(c);

        Label lq=new Label("info ");
        lq.setBounds(10,300,650,50);
        f.add(lq);

        Button b=new Button("register");
        b.setBounds(150,400,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                sb.append("name " + tf.getText());
                if(chekbox1.getState()==true)
                    sb.append("course : c++ " );
                if (chckbox2.getState()==true)
                    sb.append("course : java ");
                if (checkboc11.getState()==true)
                    sb.append(" gender : male ");
                if (checkbox22.getState()==true)
                    sb.append(" gender : female ");
                sb.append("city " +c.getItem(c.getSelectedIndex()));
                lq.setText(sb.toString());
            }
        });
        //f.add(b);
        f.setSize(700,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        RegistrationFormCode r=new RegistrationFormCode();
    }
}
