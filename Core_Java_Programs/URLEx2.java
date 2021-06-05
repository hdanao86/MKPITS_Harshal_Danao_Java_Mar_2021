//Let us see another example URL class in Java.
import java.net.*;

public class URLEx2 {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://www.google.com/search?q=google&oq=google&sourceid=chrome&ie=UTF-8");
            System.out.println("Protocol : " +url.getProtocol());
            System.out.println("Host name : " + url.getHost());
            System.out.println("Port number : " + url.getPort());
            System.out.println("Default port Number : " + url.getDefaultPort());
            System.out.println("Query String : " +url.getQuery());
            System.out.println("Path : " + url.getPath());
            System.out.println("File : " + url.getFile());
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
