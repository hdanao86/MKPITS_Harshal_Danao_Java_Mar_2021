//wap to accept 5 subject marks using while loop calculate total, per, and grade.
import java.util.*;

public class WhileStudentPercentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sub=1;
        int num=1;
        int total=0;
        float per=1;
        while (num<=5) {
            System.out.println("enter subject marks " + num);
            sub=sc.nextInt();
            total=total+sub;
            per=(float) (total / 500.0f) * 100.0f;
            num++;
        }
        System.out.println("total marks of 5 subject = " + total);
        System.out.println("percentage = " + per);
        if (per>=90 && per<=100)
        {
            System.out.println("grade : Distinction");
        }
        if (per>=80 && per<=89)
        {
            System.out.println("grade : First");
        }
        if (per>=60 && per<=79)
        {
            System.out.println("garde : Second");
        }
        if (per<40)
        {
            System.out.println("garde : fail");
        }
    }

}
