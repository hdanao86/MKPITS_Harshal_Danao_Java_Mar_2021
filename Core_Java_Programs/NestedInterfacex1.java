//Example of nested interface which is declared within the interface
//In this example, we are going to learn how to declare the nested interface and how we can access it.

interface showable{
    void show();
    interface Message{
        void msg();
    }
}
public class NestedInterfacex1 implements showable.Message {
    public void msg()
    {
        System.out.println("hello nested interface");
    }
    public static void main(String[] args) {
        showable.Message message=new NestedInterfacex1();
        message.msg();

    }
}
