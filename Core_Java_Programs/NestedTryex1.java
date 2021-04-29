//Let's see a simple example of java nested try block.

public class NestedTryex1 {
    public static void main(String[] args) {
        try {
            try{
                System.out.println("going to divide");
                int b=39/0;
            }catch (ArithmeticException e)
            {
                System.out.println(e);
            }
            try {
                int a[]=new int[5];
            }catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println("other statement");
        }catch (Exception e)
        {
            System.out.println("handled");
        }
        System.out.println("normal flow");

    }
}
