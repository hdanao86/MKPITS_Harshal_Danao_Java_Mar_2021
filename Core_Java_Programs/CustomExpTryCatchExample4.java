public class CustomExpTryCatchExample4 {
    public static void main(String[] args) {
        try {
            int data=50/0;
        }
        //handling the exception
        catch (Exception e)
        {
            //display the custome exception message
            System.out.println("cannot divide by zero");
        }
    }
}
