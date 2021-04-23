//In this example, the Printable interface has only one method, and its implementation is provided in the A6 class.

interface printable1
{
    void print();
}
class A6 implements printable1
{
    public void print()
    {
        System.out.println("Hello");
    }
}
public class InterfaceEx3 {
    public static void main(String[] args) {
        A6 a=new A6();
        a.print();
    }
}
