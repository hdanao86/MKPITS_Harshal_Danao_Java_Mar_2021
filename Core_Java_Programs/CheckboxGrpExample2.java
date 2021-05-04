//registration form code

import java.awt.*;
public class CheckboxGrpExample2 {
    Label l1,l2,l3,l4;
    TextField tf;
    Button b1;
    CheckboxGrpExample2(){
        Frame f=new Frame("CheckboxGroup Example");
        l1=new Label("register yourself");
        l1.setBounds(150,50,100,20);
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

        Checkbox chekbox1=new Checkbox("C++",false);
        chekbox1.setBounds(130,150,50,50);
        Checkbox chekbox2=new Checkbox("java",true);
        chekbox2.setBounds(200,150,50,50);
        f.add(chekbox1);
        f.add(chekbox2);

        l4=new Label("select gender");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        CheckboxGroup cbg1=new CheckboxGroup();
        Checkbox checkebox11=new Checkbox("male",cbg1,false);
        checkebox11.setBounds(120,200,50,50);
        Checkbox chekbox22=new Checkbox("female ",cbg1,true);
        chekbox22.setBounds(180,200,52,55);
        f.add(chekbox1);
        f.add(chekbox2);
        f.add(checkebox11);
        f.add(chekbox22);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        CheckboxGrpExample2 c=new CheckboxGrpExample2();
    }
}
