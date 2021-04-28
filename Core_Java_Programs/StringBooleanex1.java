import java.util.Scanner;

public class StringBooleanex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter email address ");
        String s=sc.next();
        boolean ss=s.contains(".com");
        if(ss==true)
        {
            System.out.println("valid emial address");
        }
        else
        {
            System.out.println("invalid email address");
        }

    }
}
