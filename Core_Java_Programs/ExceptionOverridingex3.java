//Example in case subclass overridden method declares subclass exception

class Parent2
{
    void msg()throws Exception
    {
        System.out.println("parent");
    }
}
public class ExceptionOverridingex3 extends Parent2 {
    void msg() throws ArithmeticException {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent2 p = new ExceptionOverridingex3();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}
