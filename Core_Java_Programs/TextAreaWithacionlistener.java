//Java AWT TextArea Example with ActionListener

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaWithacionlistener extends Frame implements ActionListener {
    Label l1,l2;
    TextArea area;
    Button b;
    TextAreaWithacionlistener(){
        l1=new Label();
        l1.setBounds(50,50,100,30);
        l2=new Label();
        l2.setBounds(160,50,100,30);
        area=new TextArea();
        area.setBounds(20,100,200,250);
        b=new Button("count words");
        b.setBounds(100,400,100,30);
        b.addActionListener(this);
        add(l1);
        add(l2);
        add(area);
        add(b);
        setSize(400,450);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String text=area.getText();
        String words[]=text.split("\\s");
        l1.setText("words : " + words.length );
        l2.setText("characters : " + text.length());
    }

    public static void main(String[] args) {
        TextAreaWithacionlistener t=new TextAreaWithacionlistener();
    }
}
