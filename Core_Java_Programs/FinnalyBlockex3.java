//Let's see the java finally example where exception occurs and handled.

public class FinnalyBlockex3 {
    public static void main(String[] args) {
        try {
            int data=25/0;
            System.out.println(data);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("finally block is always excuted");
            System.out.println("rest of the code");
        }
    }
}
