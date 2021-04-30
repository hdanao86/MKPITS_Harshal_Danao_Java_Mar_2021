//Example of nested interface which is declared within the class
//Let's see how can we define an interface inside the class and how can we access it.

class A{
    interface Message{
        void msg();
    }
}
public class NestedInterfaceClassex1 implements A.Message{
    public void msg()
    {
        System.out.println("Hello nested interface within class");
    }

    public static void main(String[] args) {
        A.Message message=new NestedInterfaceClassex1();//upcasting here
        message.msg();
    }
}
