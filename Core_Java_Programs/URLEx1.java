//Example of Java URL class
import java.net.*;

public class URLEx1 {
    public static void main(String[] args) {
        try {
            URL url=new URL("http://www.google.com/java-tutorial");
            System.out.println("Protocol :" +url.getProtocol());
            System.out.println("Host name : " +url.getHost());
            System.out.println("port number : " + url.getPort());
            System.out.println("File name : " + url.getFile());
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
