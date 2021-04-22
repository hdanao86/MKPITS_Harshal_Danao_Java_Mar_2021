
class A3
{
    int n=0;
    A3()
    {
        System.out.println("parent class constructor invoked");
    }
}
class B4 extends A3
{
    B4()
    {
        super();
        System.out.println("child class constructor invoked");
        System.out.println("n = " +n);
    }
    B4(int a)
    {
        super();
        System.out.println("child class constructor invoked " + a);
        System.out.println("n = " +n);
    }
    {
        System.out.println("instance intializer block is invoked");
        n=n+1;
    }
}
public class InstanceIntializerblockex5 {
    public static void main(String[] args) {
        B4 b1=new B4();
        B4 b2=new B4(20);
    }
}
