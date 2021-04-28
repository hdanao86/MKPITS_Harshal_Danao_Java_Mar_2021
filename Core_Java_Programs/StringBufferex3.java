import java.util.Scanner;

public class StringBufferex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your fname ");
        String fn=sc.next();
        StringBuffer sb=new StringBuffer(fn);
        System.out.println("enter your lname ");
        String ln=sc.next();
        sb.insert(5,ln);//now original string is chnaged
        System.out.println(sb);//prints hellojava
    }
}
