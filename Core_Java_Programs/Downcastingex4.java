//Let's see the real use of instanceof keyword by the example given below.

interface printable{}
class A implements printable{
    public void a()
    {
        System.out.println("a method");
    }
}
class B implements printable{
    public void b()
    {
        System.out.println("b method");
    }
}
class call1
{
    void invoke(printable p)//upcasting
    {
        if (p instanceof A)
        {
            A a=(A)p;//downcasting
            a.a();
        }
        if (p instanceof B)
        {
            B b=(B)p;//downcasting
            b.b();
        }
    }
}//end of call1 class
public class Downcastingex4 {
    public static void main(String[] args) {
        printable p=new B();
        call1 c=new call1();
        c.invoke(p);
    }
}
