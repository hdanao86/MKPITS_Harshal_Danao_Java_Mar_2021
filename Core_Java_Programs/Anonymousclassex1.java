//Java anonymous inner class example using class

abstract class Person{
    abstract void eat();
}
public class Anonymousclassex1 {
    public static void main(String[] args) {
        Person p=new Person() {
        void eat()
        {
            System.out.println("nice fruits");
        }
        };
        p.eat();
    }
}
