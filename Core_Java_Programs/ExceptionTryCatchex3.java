import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

public class ExceptionTryCatchex3 {
    public static void main(String[] args) {
        try{
            //code that may raise exception
            int data=100/0;
        }catch (ArithmeticException e)
        {
            System.out.println(e);
            //rest code of the program
        }
        System.out.println("rest code of the program");
    }
}
