import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("my name is harshal"," ");
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
