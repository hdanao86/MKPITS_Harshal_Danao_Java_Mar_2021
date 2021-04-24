//If there is any private, final or static method in a class, there is static binding.

class Dog{
   /* private */ void eat()
    {
        System.out.println("dog is eating...");
    }
}
public class Staticbindingex1 {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();

    }
}
