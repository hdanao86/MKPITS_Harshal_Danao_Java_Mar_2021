//In the above example exception occurs in m() method where it is not handled,so it is propagated to previous n() method where it is not handled, again it is propagated to p() method where exception is handled.

public class ExceptionPropogationex2 {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        n();
    }

    public static void main(String[] args) {
        ExceptionPropogationex2 obj=new ExceptionPropogationex2();
        try {
            obj.p();
        }catch (Exception e)
        {
            System.out.println("exception handled");
            System.out.println("normal flow...");
        }
    }
}
