public class Multivatchex2 {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            System.out.println(a[10]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("aritmatic exception");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index expection");
        }
        catch (Exception e)
        {
            System.out.println("parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
