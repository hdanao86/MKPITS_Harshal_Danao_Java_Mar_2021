//As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class. For example:

interface printable3
{
    void print();
}
interface showable2
{
    void print();
}
class InterfaceEx8 implements printable3,showable2 {
    public void print()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        InterfaceEx8 i=new InterfaceEx8();
        i.print();
    }
}
