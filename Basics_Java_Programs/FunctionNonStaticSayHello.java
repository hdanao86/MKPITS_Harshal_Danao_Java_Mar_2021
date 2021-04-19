//create a non static sayhello method

import java.util.*;
public class FunctionNonStaticSayHello {
    public static void main(String[] args){
        //creating a object of class
        FunctionNonStaticSayHello f1=new FunctionNonStaticSayHello();
        f1.sayHello();//calling user defined function

        FunctionNonStaticSayHello f2=new FunctionNonStaticSayHello();
        f2.sayHello();//calling user defined function

        sayHi();
    }
    void sayHello()
    {
        System.out.println("hello everybody");
        System.out.println("how are you");
        System.out.println("what are you doing");
    }
    static void sayHi()
    {
        System.out.println("hello from student");
    }
}
