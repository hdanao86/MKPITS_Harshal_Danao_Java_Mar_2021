//Example of Sending DatagramPacket by DatagramSocket
import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class DatagramPacketEx1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        String  str="welcome java world";
        InetAddress ip=InetAddress.getByName("127.0.0.1");
        DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
        ds.send(dp);
        ds.close();
    }
}
