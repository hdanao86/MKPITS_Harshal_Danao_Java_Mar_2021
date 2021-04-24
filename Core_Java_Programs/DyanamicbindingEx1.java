//When type of the object is determined at run-time, it is known as dynamic binding.
//Example of dynamic binding

class Animal
{
    void eat()
    {
        System.out.println("animal is eating...");
    }
}
class Dog1 extends Animal
{
    void eat()
    {
        System.out.println("dog is eating...");
    }
}
public class DyanamicbindingEx1 {
    public static void main(String[] args) {
        Animal a=new Dog1();
        a.eat();
    }
}


//In the above example object type cannot be determined by the compiler, because the instance of Dog is also an instance of Animal.So compiler doesn't know its type, only its base type.