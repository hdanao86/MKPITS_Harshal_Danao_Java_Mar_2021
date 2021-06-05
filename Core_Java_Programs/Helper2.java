
import java.util.TimerTask;
import  java.io.*;
import  java.net.*;
class Helper2 extends TimerTask
{
    awtnex ex;
Socket s;
ServerSocket ss;
    Helper2(awtnex ex,ServerSocket ss,Socket s) {
        this.ex=ex;
        this.ss=ss;
        this.s=s;
        sb=new StringBuilder();

    }
    StringBuilder sb;

    public void run() {
    //  System.out.println(  "timer running " + i);
      //        ex.ta.setText("timer running " + i);
        //    i = i + 1;
        try {

            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = din.readUTF();
            sb.append("user 2 : " + str + "\n");
            ex.ta.setText(sb.toString());
        }
        catch ( Exception ee) {

        }

    }
}


