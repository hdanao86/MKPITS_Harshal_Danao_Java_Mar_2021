//-wap to accept 5 subject marks from the user and calculate total using while loop.

import java.util.*;

public class WhileStudent {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sub=1;
        int num=1;
        int total=0;

        while (num<=5) {
            System.out.println("enter subject marks " + num);
            sub=sc.nextInt();
            total=total+sub;
            num++;
        }
        System.out.println("total marks of 5 subject = " + total);
    }
}
