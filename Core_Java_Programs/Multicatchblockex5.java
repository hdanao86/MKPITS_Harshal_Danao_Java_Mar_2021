//In this example, we generate NullPointerException, but didn't provide the corresponding exception type. In such case, the catch block containing the parent exception class Exception will invoked.

public class Multicatchblockex5 {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("arithmatic exception");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("arrayofindex exception");
        }
        catch (Exception e)
        {
            System.out.println("parent exception occurs");
        }
        System.out.println("rest of the code");
    }
}
