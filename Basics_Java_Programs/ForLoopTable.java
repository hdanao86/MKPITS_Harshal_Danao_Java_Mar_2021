//wap to accept a number and print table of that number using for loop.

import java.util.*;
public class ForLoopTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num,res=1;
        int cnt;
        System.out.println("enter number ");
        num=sc.nextInt();
        System.out.println("Tbel of a number " + num);
        for(cnt=1;cnt<=10;cnt++)
        {
            res=num*cnt;
            System.out.println( + num + " * " + cnt + " = " + res);
        }
    }
}
