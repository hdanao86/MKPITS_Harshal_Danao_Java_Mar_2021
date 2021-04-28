import java.util.Scanner;

public class StringBufferdelex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your fname");
        String fn=sc.next();
        StringBuffer sb=new StringBuffer(fn);
        System.out.println("enter your lname");
        String ln=sc.next();
        sb.delete(1,3);//now original string changed
        System.out.println(sb);
    }
}
