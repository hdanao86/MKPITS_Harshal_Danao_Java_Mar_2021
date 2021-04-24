//wap to accept 2 no. and display the greater no.
import java.util.*;
public class Greater {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        num1=sc.nextInt();
        System.out.println("enter number 2");
        num2=sc.nextInt();
        if(num1 > num2) {
            System.out.println("number 1 is greater : "  + num1);
        }
        if(num2 > num1) {
            System.out.println("number 2 is greater : " + num2);
        }

}
}
