//Java AWT Button Example

import java.awt.*;
public class ButtonExample {
    public static void main(String[] args) {
        Frame f=new Frame("button eaxmple");
        Button b=new Button("click here");
        b.setBounds(50,100,80,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
