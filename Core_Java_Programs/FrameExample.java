import java.awt.*;

public class FrameExample extends Frame {
    FrameExample()
    {
        TextField t1=new TextField();
        t1.setBounds(10,40,240,25);
        add(t1);
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Button b7=new Button("7");
        Button b8=new Button("8");
        Button b9=new Button("9");
        Button b10=new Button("c");
        Button b11=new Button("0");
        Button b12=new Button("=");
        Button b13=new Button("+");
        Button b14=new Button("-");
        Button b15=new Button("*");
        Button b16=new Button("/");
        b1.setBounds(10,50,80,50);
        add(b1);
        b2.setBounds(90,50,80,50);
        add(b2);
        b3.setBounds(170,50,80,50);
        add(b3);
        b4.setBounds(10,100,80,50);
        add(b4);
        b5.setBounds(90,100,80,50);
        add(b5);
        b6.setBounds(170,100,80,50);
        add(b6);
        b7.setBounds(10,150,80,50);
        add(b7);
        b8.setBounds(90,150,80,50);
        add(b8);
        b9.setBounds(170,150,80,50);
        add(b9);
        b10.setBounds(10,200,80,50);
        add(b10);
        b11.setBounds(90,200,80,50);
        add(b11);
        b12.setBounds(170,200,80,50);
        add(b12);
        b13.setBounds(10,250,60,40);
        add(b13);
        b14.setBounds(69,250,60,40);
        add(b14);
        b15.setBounds(129,250,60,40);
        add(b15);
        b16.setBounds(189,250,60,40);
        add(b16);
        setSize(260,300);
        setTitle("calculator");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        FrameExample f=new FrameExample();
    }
}
