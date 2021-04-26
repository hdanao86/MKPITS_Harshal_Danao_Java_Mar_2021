//example of instanceof operator
//2- example of instanceof operator with base class
//3  with null value


public class Person {
}
class Customer extends Person
{
    String name;
}
class instanceex
{
    public static void main(String[] args) {
        Customer c=null;
        boolean b=c instanceof Person;
        System.out.println(b);
        if(b==true){
            System.out.println("code to be proceed");
        }
    }
}
