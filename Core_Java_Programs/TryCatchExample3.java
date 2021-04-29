public class TryCatchExample3 {
    public static void main(String[] args) {
        try {
            int data=50/0;
        }
        //handling the exception by using Exception class(parent Exception)
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("rets of the code");
    }

}
