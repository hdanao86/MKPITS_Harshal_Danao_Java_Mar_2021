//create a non static sayhello method

public class sayhelo {
    public static void main(String[] args) {
        sayhelo s=new sayhelo();
        //creting obect of sayhelo class
        s.SayHello();
        sayhelo s1=new sayhelo();
        s1.SayHello();//calling user defined function
        sayhi();
    }
    void SayHello()
    {
        System.out.println("hello everybody");
        System.out.println("how are you");
    }
    static void sayhi()
    {
        System.out.println("hello from sayhelo class");
    }
}
