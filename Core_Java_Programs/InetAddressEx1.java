//Let's see a simple example of InetAddress class to get ip address of www.google.com website.
import java.io.*;
import java.net.*;

public class InetAddressEx1 {
    public static void main(String[] args) {
        try{
            InetAddress ip=InetAddress.getByName("www.google.com");

            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());
        }catch(Exception e){

            System.out.println(e);
        }
    }
}


