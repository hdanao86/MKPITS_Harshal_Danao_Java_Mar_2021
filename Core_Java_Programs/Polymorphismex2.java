//example of runtime polymorphism using account, saving and current class

import java.util.*;
class account3
{
    int actno;
    int bal=1000;
    String deposit(int actno,int amt)
    {
        return "account class deposit method";
    }
    String withdrawl(int actno,int amt)
    {
        this.actno=actno;
        if(amt>bal)
        {
            return "insufficient balance";
        }
        bal=bal-amt;
        {
            return "account withdrawl for act no " + actno + " , bal is " + bal;

        }
    }
}
class saving4 extends account3
{
    int interest=500;
    String deposit(int actno,int amt)
    {
        this.actno=actno;
        bal=bal+amt+interest;
        return "account deposited for acct no " + actno + " , bal is " + bal;

    }
}
class current4 extends account3
{
    String deposit(int actno,int amt)
    {
        this.actno=actno;
        bal=bal+amt;
        return "account deposited for acc no " + actno + " , bal is " + bal;

    }
}
public class Polymorphismex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account no ");
        int actno=sc.nextInt();
        System.out.println("enter amount ");
        int amt=sc.nextInt();
        System.out.println("enter saving or current account type ");
        String acttype=sc.next();
        System.out.println("do you want to deposit or withdrawl ");
        String ans=sc.next();
        account3 act=null;
        String str;
        if(acttype.equals("saving"))
        {
            act=new saving4();
        }
        else if(acttype.equals("current"))
        {
            act =new current4();
        }
        else
        {
            System.out.println("invalid account type");
        }
        if (ans.equals("deposit"))
        {
            str = act.deposit(actno,amt);
            System.out.println(str);
        }
        else if (ans.equals("withdrawl"))
        {
            str = act.withdrawl(actno,amt);
            System.out.println(str);
        }
    }
}
