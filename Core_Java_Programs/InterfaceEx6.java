//Java Interface Example: Bank
//
//Let's see another example of java interface which provides the implementation of Bank interface.

interface Bank1
{
    int roi();
}
class sbi1 implements Bank1
{
    public int roi()
    {
        return 9;
    }
}
class pnb1 implements  Bank1
{
    public int roi()
    {
        return 8;
    }
}
public class InterfaceEx6 {
    public static void main(String[] args) {
        Bank1 b=new sbi1();
        System.out.println("roi = " + b.roi());
    }
}
