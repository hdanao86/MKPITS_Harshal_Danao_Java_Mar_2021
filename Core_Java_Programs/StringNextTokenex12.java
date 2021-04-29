import java.util.StringTokenizer;

public class StringNextTokenex12 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("my name harshal,is");
        //printing next token
        System.out.println("next token is : " + st.nextToken(","));
    }
}
