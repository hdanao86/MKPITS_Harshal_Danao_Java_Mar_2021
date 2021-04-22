//super keyword is used to invoke parent class constructor.
class Animal4
{
    Animal4()
    {
        System.out.println("animal is created");
    }
}
class Dog4 extends Animal4
{
    Dog4()
    {
        super();
        System.out.println("dog is created");
    }
}
public class Superkeywordex5 {
    public static void main(String[] args) {
        Dog4 d=new Dog4();
    }
}
