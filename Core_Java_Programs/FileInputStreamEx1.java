import java.io.FileInputStream;

public class FileInputStreamEx1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin=new FileInputStream("H:\\testout.txt");
            int i=fin.read();
            System.out.println((char)i);
            fin.close();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
