//wap to accept 5 subject marks and display the total using for loop.

import java.util.*;
public class ForLoopSubjectTotal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sub,total=0;
        int cnt;
        for (cnt=1;cnt<=5;cnt++)
        {
            System.out.println("enter  subject marks " + cnt);
            sub=sc.nextInt();
            total=total+sub;
        }
        System.out.println("total marks " + " = " + total);
    }
}
