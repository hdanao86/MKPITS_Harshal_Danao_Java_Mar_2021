//wap to accept 3 no. and display the greater no.
import java.util.*;
public class Greaterumber {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        num1=sc.nextInt();
        System.out.println("enter number 2");
        num2=sc.nextInt();
        System.out.println("enter number 3");
        num3=sc.nextInt();
        if(num1 > num2 && num1 > num3) {
            System.out.println("number 1 is greater : "  + num1);
        }
        if(num2 > num1 && num2 > num3) {
            System.out.println("number 2 is greater : " + num2);
        }
        else if (num3 > num1 && num3 > num2)
        {
            System.out.println("number 3 is greater : ");

    }
}

}
