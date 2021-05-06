import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AwtVowelEx7 {
    AwtVowelEx7(){
        JFrame f=new JFrame("welcome");
        JLabel l=new JLabel("enter character ");
        l.setBounds(10,50,100,30);
        f.add(l);
        JTextField tf=new JTextField();
        tf.setBounds(110,50,100,30);
        f.add(tf);
        JLabel l1=new JLabel("character is ");
        l1.setBounds(20,150,100,100);
        f.add(l1);

        JButton b=new JButton("vowel or not");
        b.setBounds(100,100,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
              //  int n=Integer.parseInt(tf.getText());
                String n=tf.getText();
                char ch =n.charAt(0);
                switch (ch){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        sb.append("vowel : " + (ch));
                        break;
                    default:
                        sb.append("not vowel : " + (ch));
                }
                l1.setText(sb.toString());


            }

        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        AwtVowelEx7 a=new AwtVowelEx7();
    }
}
