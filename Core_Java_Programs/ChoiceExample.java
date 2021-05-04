//Java AWT Choice Example

import java.awt.*;

public class ChoiceExample {
    ChoiceExample()
    {
        Frame f=new Frame();
        Choice c=new Choice();
        c.setBounds(100,100,75,75);
        c.add("item 1");
        c.add("item 2");
        c.add("item 3");
        c.add("item 4");
        c.add("item 5");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        ChoiceExample c1=new ChoiceExample();
    }
}
