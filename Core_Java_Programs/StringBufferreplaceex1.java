import java.util.Scanner;

public class StringBufferreplaceex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your fname ");
        String fn=sc.next();
        StringBuffer sb=new StringBuffer(fn);
        System.out.println("enter your lname ");
        String ln=sc.next();
        sb.replace(1,5,ln);//now original string changed
        System.out.println(sb);
    }
}
