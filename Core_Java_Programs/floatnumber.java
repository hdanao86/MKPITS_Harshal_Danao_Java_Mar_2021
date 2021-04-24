//wap to accept float number
import java.util.*;

class Float {
    public static void main(String[] args) {
        float num1,num2,res=0;
        char operator;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        num1=sc.nextFloat();
        System.out.println("enter number 2");
        num2=sc.nextFloat();
        System.out.println("enter operator like + - :");
        operator=sc.next().charAt(0);
        if(operator=='+')
            res=num1+num2;
        else if(operator=='-')
            res=num1-num2;
        else
            System.out.println("Invalid character");
        System.out.println("result is" +res);
    }
}



