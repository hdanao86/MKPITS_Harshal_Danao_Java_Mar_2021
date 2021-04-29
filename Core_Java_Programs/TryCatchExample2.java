public class TryCatchExample2 {
    public static void main(String[] args) {
        try {
            int data=50/0;//may thrown exception
            //if exception occurs the remaining statement will not excute
            System.out.println("rest of the code");
        }

        //handling the exception
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
