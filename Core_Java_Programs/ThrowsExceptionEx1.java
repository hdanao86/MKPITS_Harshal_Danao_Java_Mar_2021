import java.io.IOException;

public class ThrowsExceptionEx1 {
    void m() throws IOException {
        throw new IOException("device error");//checked exception
    }
        void n()throws IOException{
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
        ThrowsExceptionEx1 obj=new ThrowsExceptionEx1();
        obj.p();
        System.out.println("normal flow");
    }

}


