//If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.

interface printable2
{
    void print();
}
interface showable
{
    void show();
}
class A7 implements printable2,showable
{
    public void print()
    {
        System.out.println("Hello");
    }
    public void show()
    {
        System.out.println("welcome");
    }

}
public class InterfaceEx7 {
    public static void main(String[] args) {
        A7 a=new A7();
        a.print();
        a.show();
    }
}
