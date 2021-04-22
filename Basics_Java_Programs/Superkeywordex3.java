//super can be used to invoke parent class method

class Animal2
{
    void  eat()
    {
        System.out.println("eating...");
    }
}
class Dog2 extends Animal2
{
    void eat()
    {
        System.out.println("eating bread... ");
    }
    void bark()
    {
        System.out.println("barking...");
    }
    void work()
    {
        super.eat();
        bark();
    }
}
public class Superkeywordex3 {
    public static void main(String[] args) {
        Dog2 d=new Dog2();
        d.work();
    }
}
