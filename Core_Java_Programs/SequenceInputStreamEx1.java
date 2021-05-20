import java.io.*;

public class SequenceInputStreamEx1 {
    public static void main(String[] args)throws Exception {
        FileInputStream input1=new FileInputStream("H:\\testin.txt");
        FileInputStream input2=new FileInputStream("H:\\testout.txt");
        SequenceInputStream sin=new SequenceInputStream(input1,input2);
        int i;
        while ((i=sin.read()) != -1)
        {
            System.out.print((char)i);
        }
        sin.close();
        input1.close();
        input2.close();

    }
}
