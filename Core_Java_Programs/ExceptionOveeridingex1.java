//1) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
//it declare the unchecked exception
import java.io.IOException;

class Parent{
    void msg()
    {
        System.out.println("parent");
    }
}
public class ExceptionOveeridingex1 extends Parent {
void msg()throws ArithmeticException{
    System.out.println("child class");
}

    public static void main(String[] args) {
    Parent p=new ExceptionOveeridingex1();
        p.msg();
    }
}
