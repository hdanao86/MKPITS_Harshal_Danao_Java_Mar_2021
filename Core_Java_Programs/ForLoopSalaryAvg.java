// wap to accept salary of 10 employee using for loop and then display the average salary.

import java.util.*;

public class ForLoopSalaryAvg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sub,total=0;
        int cnt;
        float avg=1;
        for (cnt=1;cnt<=10;cnt++)
        {
            System.out.println("enter  subject marks " + cnt);
            sub=sc.nextInt();
            total=total+sub;
            avg=total/10.0f;
        }
        System.out.println("total marks " + " = " + total);
        System.out.println("average = " + avg);
    }
}
