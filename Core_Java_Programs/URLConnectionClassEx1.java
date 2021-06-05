//Example of Java URLConnection class

import java.net.*;
import java.io.*;
public class URLConnectionClassEx1 {
    public static void main(String[] args) {
        try {
            URL url=new URL("http://www.google.com/java-tutorial");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int i;
            while ((i=stream.read())!=-1){
                System.out.println((char) i);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
