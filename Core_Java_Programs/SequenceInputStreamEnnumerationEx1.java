import java.io.*;
import java.util.*;
public class SequenceInputStreamEnnumerationEx1{
public static void main(String args[])throws IOException{
        //creating the FileInputStream objects for all the files
        FileInputStream fin1=new FileInputStream("H:\\a.txt");
        FileInputStream fin2=new FileInputStream("H:\\b.txt");
        FileInputStream fin3=new FileInputStream("H:\\c.txt");
        FileInputStream fin4=new FileInputStream("H:\\d.txt");
        //creating Vector object to all the stream
        Vector v=new Vector();
        v.add(fin1);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
        //creating enumeration object by calling the elements method
        Enumeration e=v.elements();
        //passing the enumeration object in the constructor
        SequenceInputStream bin=new SequenceInputStream(e);
        int i=0;
        while((i=bin.read())!=-1){
        System.out.print((char)i);
        }
        bin.close();
        fin1.close();
        fin2.close();
        fin3.close();
        fin4.close();
        }
        }
