//wap to accept 5 subject marks using for loop calculate total, per, grade.

import java.util.*;

public class ForLoopStudentPer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sub,total=0;
        int cnt;
        float per=1;
        for (cnt=1;cnt<=5;cnt++)
        {
            System.out.println("enter  subject marks " + cnt);
            sub=sc.nextInt();
            total=total+sub;
            per=(float)(total / 500.0f) * 100.0f;
        }
        System.out.println("total marks " + " = " + total);
        System.out.println("percentage = " + per);
    }
}
