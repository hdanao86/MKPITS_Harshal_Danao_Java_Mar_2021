//wap to accept a number and print factorial of that no. using for loop.

import java.util.*;
public class ForLoopFact {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        int cnt;
        int fact=1;

        System.out.println("enter number");
        num=sc.nextInt();

        for (cnt=num;cnt>0;cnt--)
        {
            fact=fact*cnt;
        }
        System.out.println("factorial of " +  num   +  " = "  + fact);

    }
}
