
abstract class Bank
{
    abstract  int getroi();
}
class sbi extends Bank
{
    int getroi()
    {
        return 7;
    }
}
class pnb extends Bank
{
    int getroi()
    {
        return 8;
    }
}
public class Abstractex4 {
    public static void main(String[] args) {
        Bank b;
        b=new sbi();
        System.out.println("roi is = " + b.getroi() + "%");
        b=new pnb();
        System.out.println("roi is = " +b.getroi() + "%");
    }
}
