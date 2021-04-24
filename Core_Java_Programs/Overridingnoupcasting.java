class Bank6
{
    float getroi()
    {
        return 0;
    }
}
class sbi extends Bank6
{
    float getroi()
    {
        return 8.4f;
    }
}
class icici extends Bank6
{
    float getroi()
    {
        return 7.3f;
    }
}
public class Overridingnoupcasting {
    public static void main(String[] args) {
        Bank6 b;
        b=new sbi();
        System.out.println("sbi roi : " + b.getroi());
        b=new icici();
        System.out.println("icici roi : " + b.getroi());
    }
}
