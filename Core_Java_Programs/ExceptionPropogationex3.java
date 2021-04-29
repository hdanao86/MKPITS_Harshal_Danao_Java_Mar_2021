//Exception can be handled in any method in call stack either in main() method,p() method,n() method or m() method.

public class ExceptionPropogationex3 {
    void m(){
        try {
            int data=50/0;
        }catch (Exception e)
        {
            System.out.println("exception handled m");
        }
    }
        void n(){
            m();
        }
        void p(){
            n();
        }

    public static void main(String[] args) {
        ExceptionPropogationex3 obj=new ExceptionPropogationex3();
        try{
            obj.p();

    }catch (Exception e)
        {
            System.out.println("exception handled");
        }
        System.out.println("normal flow");
    }
}
