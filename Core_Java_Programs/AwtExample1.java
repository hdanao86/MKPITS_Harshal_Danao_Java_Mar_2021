import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtExample1 {
    Label l1,l2,l3;
    TextField tf1,tf2;
   // Button b;
    AwtExample1()
    {
        Frame f=new Frame("Bank Example");
         l1=new Label("enter account no : ");
        l1.setBounds(20,50,150,30);
        f.add(l1);

         tf1=new TextField();
        tf1.setBounds(180,50,150,30);
        f.add(tf1);
         l2=new Label("enter amount : ");
        l2.setBounds(20,100,150,30);
        f.add(l2);

         tf2=new TextField();
        tf2.setBounds(180,100,150,30);
        f.add(tf2);

        l3=new Label("deposit");
        l3.setBounds(50,250,150,20);
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox checkbox1=new Checkbox("deposit",cbg,false);
        checkbox1.setBounds(100,200,150,50);
        f.add(checkbox1);
        Checkbox checkbox2=new Checkbox("withdrawl",cbg,true);
        checkbox2.setBounds(100,250,150,50);
        f.add(checkbox2);

        Label lq=new Label("info ");
        lq.setBounds(10,350,450,50);
        f.add(lq);

        Button b=new Button("ok");
        b.setBounds(200,300,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                sb.append(" account no " + tf1.getText());
                sb.append(" amount " + tf2.getText());
                if (checkbox1.getState()==true)
                    sb.append(" money : deposit ");
                if (checkbox2.getState()==true)
                    sb.append(" money : withdrawl ");
                lq.setText(sb.toString());
            }
        });

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);



    }

    public static void main(String[] args) {
        AwtExample1 a=new AwtExample1();
    }
}
