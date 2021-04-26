//downcasting example with accepting actype from the user

import java.util.Scanner;

interface Account1{
    void deposit(int amt);
}
class saving1 implements Account1
{
    public void deposit(int amt)
    {
        System.out.println("deposit of saving");
    }
}
class current1 implements Account1
{
    public void deposit(int amt)
    {
        System.out.println("deposit of current");
    }
}
class Call{
    void invoke(Account1 act){//upcasting
        if (act instanceof saving1){
            saving1 s=(saving1)act;//downcasting
            s.deposit(200);
        }
        if (act instanceof current1){
            current1 c=(current1)act;//downcasting
            c.deposit(200);
        }
    }
}//end of class
public class Downcastingex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account1 ac=null;
        System.out.println("enter account type (saving or current)");
        String at=sc.next();
        if (at.equals("saving")){
            ac=new saving1();
        }
        else if (at.equals("current")){
         ac=new current1();
        }
        Call c=new Call();
        c.invoke(ac);
    }
}
