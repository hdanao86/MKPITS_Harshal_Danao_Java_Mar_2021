//Example of an abstract class that has abstract and non-abstract methods

abstract class Bike1
{
    Bike1()
    {
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear()
    {
        System.out.println("gear changed");
    }
}
//creating a child class which inherits abstract class
class Honda1 extends Bike1
{
    void run()
    {
        System.out.println("running safely");
    }
}
//Creating a Abstractex5 class which calls abstract and non-abstract methods
public class Abstracrex5 {
    public static void main(String[] args) {
        Bike1 b=new Honda1();
        b.run();
        b.changeGear();
    }
}
