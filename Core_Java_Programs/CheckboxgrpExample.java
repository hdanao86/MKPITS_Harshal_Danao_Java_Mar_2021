//Java AWT CheckboxGroup Example

import java.awt.*;

public class CheckboxgrpExample {
    CheckboxgrpExample(){
        Frame f=new Frame("CheckGroup Example");
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox checkbox1=new Checkbox("C++",cbg,false);
        checkbox1.setBounds(100,100,50,50);
        Checkbox checkbox2=new Checkbox("java",cbg,true);
        checkbox2.setBounds(100,150,50,50);
        f.add(checkbox1);
        f.add(checkbox2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        CheckboxgrpExample c=new CheckboxgrpExample();
    }
}
