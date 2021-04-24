//super is used to refer immediate parent class instance variable.

class Animal
{
    String color="white";
}
class Dog extends Animal
{
    String color="black";
    void printcolor()
    {
       System.out.println(color);//print color of dog class
        System.out.println(super.color);
    }
}
public class SuperKeywordex1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.printcolor();
    }
}
