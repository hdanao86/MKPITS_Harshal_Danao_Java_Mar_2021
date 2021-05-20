import java.io.FileOutputStream;

public class FileOutputStreamExample2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout=new FileOutputStream("H:\\testout.txt");
            String s="welcome to mkpits";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success");
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
