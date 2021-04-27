import bank.Account;
import java.util.*;


public class Defaultmodifierex2 {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter amount to deposit");
        int amount=s.nextInt();
        Account act=new Account();
//act.bal=500; since bal is default
        String str=act.deposit(amount);
        System.out.println(str);
    }
}


