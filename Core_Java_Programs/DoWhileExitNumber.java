// wap to accept a number and exit if user entered a number 5 using do while loop.

import java.util.*;
public class DoWhileExitNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        do {
            System.out.println("enter number ");
            num=sc.nextInt();
            System.out.println("number " + num);
        }
        while (num !=5);
    }
}
