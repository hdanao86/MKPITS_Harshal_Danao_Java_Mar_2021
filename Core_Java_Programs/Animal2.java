//Downcasting can also be performed without the use of instanceof operator as displayed in the following example:


public class Animal2 {}
class Dog3 extends Animal2
{
    static void method(Animal2 a)
    {
        Dog3 d=(Dog3)a;//downcasting
        System.out.println("downcasting will be performed");
    }

    public static void main(String[] args) {
        Animal2 a=new Dog3();
        Dog3.method(a);
    }
}
