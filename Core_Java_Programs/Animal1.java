//Let's see the example, where downcasting is possible by instanceof operator.


public class Animal1 {}
class Dog2 extends Animal1
{
    static void method(Animal1 a){
        if (a instanceof Dog2){
            Dog2 d=(Dog2)a;//downcasting
            System.out.println("downcasting is performed");
        }
    }

    public static void main(String[] args) {
        Animal1 a=new Dog2();
        Dog2.method(a);
    }
}
