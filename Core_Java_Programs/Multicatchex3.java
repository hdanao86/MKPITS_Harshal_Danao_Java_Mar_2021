//In this example, try block contains two exceptions. But at a time only one exception occurs and its corresponding catch block is invoked.

public class Multicatchex3 {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("arithimatic exception");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Arrayof index bounds eception");
        }
        catch (Exception e)
        {
            System.out.println("parent exception occurs");
        }
        System.out.println("rest of the code");
    }
}
