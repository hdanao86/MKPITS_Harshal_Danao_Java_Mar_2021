import java.util.Scanner;

public class StringBufferReversex2 {
    public static void main(String[] args) {
        String str = "";
        String str1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your fname");
        String fn=sc.next();
        StringBuffer sb=new StringBuffer(fn);
        str=sb.toString();
        sb.reverse();//now original string is changed
        str1=sb.toString();
        System.out.println("str " + str);
        System.out.println("str1 " + str1);
        if(str.equals(str1))
            System.out.println("string is palendrome");
        else
            System.out.println("String is not palendrome");
    }
}
