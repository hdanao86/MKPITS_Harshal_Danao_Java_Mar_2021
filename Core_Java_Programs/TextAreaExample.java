//Java AWT TextArea Example

import java.awt.*;

public class TextAreaExample {
    TextAreaExample(){
        Frame f=new Frame("welcome");
        TextArea area=new TextArea("welocme to java point");
        area.setBounds(30,50,150,100);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);;
        f.setVisible(true);
    }

    public static void main(String[] args) {
        TextAreaExample t=new TextAreaExample();
    }
}
