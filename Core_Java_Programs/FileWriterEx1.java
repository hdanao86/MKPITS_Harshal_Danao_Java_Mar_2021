import java.io.FileWriter;

public class FileWriterEx1 {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("H://test.txt");
            fw.write("welcome to java world.");
            fw.close();
        }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("success");
    }
}
