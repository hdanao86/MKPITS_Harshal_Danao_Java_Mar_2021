
import java.util.*;
abstract class Account
{
    int actno;
    float bal=1000;
    String str="";
    abstract void deposit(int amt);
    abstract void withdrawl(int amt);
    String showbalance()
    {
        str="act no" + actno + " balance is " + bal;
        return str;
    }
}
class saving extends Account
{
    int interest=200;
    //overriding the account class deposit method
    void deposit(int amt)
    {
        bal=bal+amt+interest;
    }
    void withdrawl(int amt)
    {
        bal=bal-amt;
    }
}
class current extends Account
{
    void deposit(int amt)
    {
        bal=bal+amt;
    }
    void withdrawl(int amt)
    {
        bal=bal-amt;
    }
}
public class Abstractex2 {
    public static void main(String[] args) {
        Account act=null;//creating a base class variable
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account no");
        int ano=sc.nextInt();
        System.out.println("enter amount");
        int amt=sc.nextInt();
        System.out.println("enter account type (saving or current)");
        String acctype=sc.next();
        System.out.println("enter deposit or withdrawl");
        String tran=sc.next();
        String result="";
        if(acctype.equals("saving"))
        {
            act=new saving();
            act.actno=ano;
            if (tran.equals("deposit"))
            {
                act.deposit(amt);
            }
            else if (tran.equals("withdrawl"))
            {
                act.withdrawl(amt);
            }
            result=act.showbalance();
        }
        else if (acctype.equals("current"))
        {
            act=new current();
            act.actno=ano;
            if (tran.equals("deposit"))
            {
                act.deposit(amt);
            }
            else if (tran.equals("withdrawl"))
            {
                act.withdrawl(amt);
            }
            result=act.showbalance();
        }
        else
        {
            System.out.println("invalid entry ");
        }
        System.out.println(result);
    }
}
