//Program of Exception Propagation

import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverXPointer;

public class ExceptionPropogationex1 {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try {
            n();
        }catch (Exception e)
        {
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropogationex1 obj=new ExceptionPropogationex1();
        obj.p();
        System.out.println("normal flow");
    }
}
