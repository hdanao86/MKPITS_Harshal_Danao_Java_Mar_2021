//Example in case subclass overridden method declares no exception

class parent
{
    void msg()throws Exception
    {
        System.out.println("parent");
    }
}
public class ExceptionOveeridingex4 extends parent{
    void msg()
    {
        System.out.println("child");
    }

    public static void main(String[] args) {
        parent p=new ExceptionOveeridingex4();
        try {
            p.msg();
        }catch (Exception e){

        }
    }
}
