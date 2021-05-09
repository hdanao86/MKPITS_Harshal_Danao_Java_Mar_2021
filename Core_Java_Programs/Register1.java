
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    Label l1,l2,l3,l4;
    TextField tf;
    Button b1;
    Register(){
        Frame f=new Frame("checkbox grp Example");
        l1=new Label("register yourself");
        l1.setBounds(200,50,100,20);
        f.add(l1);

        l2=new Label("your name");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf=new TextField();
        tf.setBounds(130,120,100,20);
        f.add(tf);

        l3=new Label("select course");
        l3.setBounds(10,170,100,20);
        f.add(l3);
        Checkbox checkbox1=new Checkbox("c++",false);
        checkbox1.setBounds(130,150,50,50);
        Checkbox checkbox2=new Checkbox("java",true);
        checkbox2.setBounds(200,150,50,50);
        f.add(checkbox1);
        f.add(checkbox2);

        l4=new Label("selct gender");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        CheckboxGroup cbg1=new CheckboxGroup();
        Checkbox checkbox11=new Checkbox("male",cbg1,false);
        checkbox11.setBounds(120,200,50,50);
        Checkbox checkbox22=new Checkbox("female",cbg1,true);
        checkbox22.setBounds(180,200,50,50);
        f.add(checkbox11);
        f.add(checkbox22);

        Label l41=new Label("select city");
        l41.setBounds(10,250,100,20);
        f.add(l41);
        Choice c=new Choice();
        c.setBounds(130,250,75,75);
        c.add("mumbai");
        c.add("nagpur");
        c.add("pune");
        c.add("hydrabad");
        c.add("banglore");
        f.add(c);

        Label lq=new Label("info");
        lq.setBounds(10,350,650,50);
        f.add(lq);

        Button b=new Button("register");
        b.setBounds(150,300,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n=tf.getText();
                String cc=null;
                if (checkbox1.getState()==true)
                    cc="c++";
                if (checkbox2.getState()==true)
                    cc = cc+ "java";
                String g=null;
                if (checkbox11.getState()==true)
                    g= "male";
                if (checkbox22.getState()==true)
                    g= "female";
                String city=c.getItem(c.getSelectedIndex());
                RegisterClass reg=new RegisterClass(n,cc,g,city);
                //display
                StringBuilder sb=new StringBuilder();
                sb.append("name : " + reg.name);
                sb.append("course : " + reg.course);
                sb.append("gender : " + reg.gender);
                sb.append("city : " + reg.city);
                lq.setText(sb.toString());

            }
        });
        f.setSize(700,500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        Register r=new Register();
    }
}
