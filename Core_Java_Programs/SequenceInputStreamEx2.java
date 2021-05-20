import java.io.*;

public class SequenceInputStreamEx2 {
    public static void main(String[] args)throws Exception {
        FileInputStream fin1=new FileInputStream("H:\\testin1.txt");
        FileInputStream fin2=new FileInputStream("H:\\testin2.txt");
        FileOutputStream fout=new FileOutputStream("H:\\testout12.txt");
        SequenceInputStream sin=new SequenceInputStream(fin1,fin2);
        int i;
        while ((i=sin.read())!=-1)
        {
            fout.write(i);
        }
        sin.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("success");

    }
}
