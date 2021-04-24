import java.util.*;
//creating parent class
class Bank4
{
    int getroi()
    {
        return 0;
    }
}
//creating child classes
class SBI extends Bank4
{
    int getroi()
    {
        return 8;
    }
}
class ICICI extends Bank4
{
    int getroi()
    {
        return 7;
    }
}
class AXIS extends Bank4
{
    int getroi()
    {
        return 9;
    }
}
//polymorphimex1 class to create objects and call the methods
public class Polymorphismex1 {
    public static void main(String[] args) {
        Bank4 b=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bank name : ");
        String bn=sc.next();
        if(bn.equals("SBI"))
            b=new SBI();
        else if (bn.equals("ICICI"))
            b=new ICICI();
        else if (bn.equals("AXIS"))
            b=new AXIS();
        System.out.println(" roi = " + b.getroi());
    }
}
