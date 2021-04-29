//In this example, along with try block, we also enclose exception code in a catch block.

public class TryCatchExample6 {
    public static void main(String[] args) {
        try {
            int data1 = 50 / 0;//may throw exception
        }
        //handling the exception
        catch (Exception e){
        //generating the exception in catch block
        int data2 = 50 / 0;
    }
    System.out.println("rest of the code");
}
}

//Here, we can see that the catch block didn't contain the exception code. So, enclose exception code within a try block and use catch block only to handle the exceptions.