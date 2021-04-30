//Simple example of AWT by inheritance(extends)

import java.awt.*;

public class AwtClass extends Frame {
    AwtClass(){
       Button b=new Button("click me");
        b.setBounds(30,100,80,30);//setting button position
        add(b);//adding buttons into frame
        setTitle("project");
        setSize(300,300);//frame size 300/300
        setLayout(null);//no layou manager
        setVisible(true);//now frame will be visible,by default not visible

    }

    public static void main(String[] args) {
        AwtClass a=new AwtClass();
    }
}
