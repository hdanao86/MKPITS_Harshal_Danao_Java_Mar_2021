import javafx.scene.transform.Scale;

import java.util.*;

//create a class account having field accountno , bal and  method deposit and withdrawl.
//create a subclass saving and override the deposit and withdrawl method.
//creating parent class
class account
{
    int actno;
    int bal=1000;
    String deposit(int actno,int amt)
    {
        return "account class deposit method";
    }
    String withdrawl(int actno,int amt)
    {
        return "account class withdrawl method";
    }
}
class saving extends account
{
    int interest=500;
    String deposit(int actno,int amt)
    {
        this.actno=actno;
        bal=bal+amt+interest;
        return "account deposited for acct no " + actno + " , bal is " + bal;
    }
    String withdrawl(int actno,int amt)
    {
        this.actno=actno;
        if (amt > bal)
        {
            return "insufficient balance ";
        }

            bal=bal-amt;
        {
            return "account withdrawl for acc no " + actno + " , bal is " + bal;

        }
    }
}
public class Bankex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account no");
        int actno=sc.nextInt();
        System.out.println("enter amount");
        int amt=sc.nextInt();
        System.out.println("do you want to deposit or withdrawl");
        String ans=sc.next();
        saving act=new saving();
        String str;
        if(ans.equals("deposit"))
        {
            str=act.deposit(actno,amt);
            System.out.println(str);
        }
        else if (ans.equals("withdrawl"))
        {
            str=act.withdrawl(actno,amt);
            System.out.println(str);
        }
    }
}
