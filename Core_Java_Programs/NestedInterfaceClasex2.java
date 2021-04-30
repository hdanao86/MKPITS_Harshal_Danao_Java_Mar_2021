
class student{
    interface instudent{
        void msg();
    }
    interface instudent1{
        void msg1();
    }
}
public class NestedInterfaceClasex2 implements student.instudent,student.instudent1 {
    public void msg()
    {
        System.out.println("hello from msg");
    }
    public void msg1()
    {
        System.out.println("hello from msg1");
    }

    public static void main(String[] args) {
        student.instudent ss=new NestedInterfaceClasex2();
        ss.msg();
        student.instudent1 ss1=new NestedInterfaceClasex2();
        ss1.msg1();
    }
}
