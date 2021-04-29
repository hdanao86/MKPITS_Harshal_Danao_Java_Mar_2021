public class ThrowExceptionex1 {
    static void validate(int age){
        if (age<18)
            throw new ArithmeticException("not valid age");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
        try {
            validate(15);
        }catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        System.out.println("rest of the code");
    }
}
