//client oof MyServer
import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("localhost",6666);
            DataOutputStream dot=new DataOutputStream(s.getOutputStream());
            dot.writeUTF("Hello server");
            dot.flush();
            dot.close();
            s.close();

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
