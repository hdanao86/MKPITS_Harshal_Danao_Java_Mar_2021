import java.util.StringTokenizer;

public class StringNextTokenex1 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("my,name,is,khan");
        //printing next token
        System.out.println("next token is : " + st.nextToken(","));
    }
}
