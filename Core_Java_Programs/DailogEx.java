//Java AWT Dialog Example

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DailogEx {
    private static Dialog d;
    DailogEx(){
        Frame f=new Frame();
        d=new Dialog(f,"Dialog Example",true);
        d.setLayout(new FlowLayout());
        Button b=new Button("Ok");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DailogEx.d.setVisible(false);
            }
        });
        d.add(new Label("click button to continue"));
        d.add(b);
        d.setSize(300,100);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        DailogEx e=new DailogEx();
    }
}
