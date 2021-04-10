//wap to accept 2 no. and operator like +,-
//and display the result
import java.util.*;

class Hello {
    public static void main(String[] args) {
        int num1,num2,res=0;
        char operator;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        num1=sc.nextInt();
        System.out.println("enter number 2");
        num2=sc.nextInt();
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



