import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtPrimeNoEx3 {
    AwtPrimeNoEx3(){
          JFrame f=new JFrame("welcome");
          JLabel l1=new JLabel("enter number : ");
          l1.setBounds(10,50,100,30);
          f.add(l1);
          JTextField tf=new JTextField();
          tf.setBounds(110,50,100,30);
          f.add(tf);

          JLabel l2=new JLabel();
          l2.setBounds(50,250,200,80);
          f.add(l2);

          JButton b=new JButton("prime no");
          b.setBounds(100,200,100,30);
          f.add(b);
          b.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  int i,n=0,res=0;
                  int a=Integer.parseInt(tf.getText());
                  n=a/2;
                  if (a==0 || a==1){
                    l2.setText(a + "is not prime no .");
                  }
                  else {
                      for (i=2;i<=n;i++){
                          if (a%i==0){
                              l2.setText(a + " is not prime no.");
                              res=1;
                              break;
                          }
                      }
                      if (res==0){
                          l2.setText(a + " is prime no. ");
                      }
                  }//end of else
              }
          });
          f.setSize(400,400);
          f.setLayout(null);
          f.setVisible(true);

    }

    public static void main(String[] args) {
        AwtPrimeNoEx3 a=new AwtPrimeNoEx3();
    }
}
