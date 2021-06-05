//Let's see a simple of Java socket programming where client sends a text and server receives and prints it.
import java.net.*;
import java.io.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();//its establish connection
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String  str=(String)dis.readUTF();
            System.out.println("message = " +str);
            ss.close();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
