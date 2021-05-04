//Java AWT Checkbox Example

import java.awt.*;

public class checkboxExample {
    checkboxExample(){
        Frame f=new Frame("checkbox Example");
        Checkbox chekbox1=new Checkbox("C++");
        chekbox1.setBounds(100,100,50,50);
        Checkbox checkbox2=new Checkbox("Java",true);
        checkbox2.setBounds(100,150,50,50);
        f.add(chekbox1);
        f.add(checkbox2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        checkboxExample c=new checkboxExample();
    }
}
