//super() is added in each class constructor automatically by compiler if there is no super() or this().
class Animal5
{
    Animal5()
    {
        System.out.println("animal is created");
    }
}
class Dog5 extends Animal5
{
    Dog5()
    {
        System.out.println("dog is created");
    }
}
public class Superkeywordex7 {
    public static void main(String[] args) {
        Dog5 d=new Dog5();
    }
}
