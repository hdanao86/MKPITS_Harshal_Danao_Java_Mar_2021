//Another example of instance block

class A2
{
    A2()
    {
        System.out.println("parent class constructor invoked");
    }
}
class B3 extends A2
{
    B3()
    {
        System.out.println("child class constructor invoked");
    }
    B3(int a)
    {
        super();
        System.out.println("child class constructor invoked " + a);
    }
    {
        System.out.println("instance intializer block invoked ");
    }
}
public class Instanceintializerblockex4 {
    public static void main(String[] args) {
        B3 b1=new B3();
        B3 b2=new B3(10);
    }
}
