//example of event handling in outside class
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventOuterex1 extends Frame {
    Button b1, b2;
    Label l1;//used for non editable text

    EventOuterex1() {
        b1 = new Button("button 1");
        b1.setBounds(100, 100, 100, 25);
        outer out = new outer(this);
        b1.addActionListener(out);
        add(b1);
        l1 = new Label("status : ");
        l1.setBounds(50, 250, 200, 50);
        add(l1);
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventOuterex1 e = new EventOuterex1();
    }
}
//creating another class for event handling
class outer implements ActionListener{
    EventOuterex1 e1;
    outer(EventOuterex1 e1){
        this.e1=e1;
    }
    public void actionPerformed(ActionEvent ae){
        e1.l1.setText("button 1 is clicked");
    }
}