//wap to accept 2 no. and print additon of 2 no.
import java.util.*;
public class Addition {
    public static void main(String[] args) {
        int num1,num2,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        num1=sc.nextInt();
        System.out.println("enter number 2");
        num2=sc.nextInt();
        res=num1+num2;
        System.out.println("Addition of 2 number is " +res);
    }
}

