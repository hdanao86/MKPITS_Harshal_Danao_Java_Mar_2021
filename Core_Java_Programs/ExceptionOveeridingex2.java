//1) Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
//Example in case subclass overridden method declares parent exception

//Example in case subclass overridden method declares same exception

class Parent1
{
    void msg()throws Exception
    {
        System.out.println("parent");
    }
}
public class ExceptionOveeridingex2 extends Parent1 {
void msg()throws Exception
{
    System.out.println("child");
}

    public static void main(String[] args) {
        Parent1 p=new ExceptionOveeridingex2();
        try {
            p.msg();
        }catch (Exception e)
        {

        }
    }
}
