//wap to accept 5 subject marks and display total , per , grade

import java.util.*;

public class Subject {
    public static void main(String[] args){
        float m1,m2,m3,m4,m5,total,per;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks 1");
        m1=sc.nextFloat();
        System.out.println("enter marks 2");
        m2=sc.nextFloat();
        System.out.println("enter marks 3");
        m3=sc.nextFloat();
        System.out.println("enter marks 4");
        m4=sc.nextFloat();
        System.out.println("enter marks 5");
        m5=sc.nextFloat();
        total = m1+m2+m3+m4+m5;
        per = (total/500.0f) * 100.0f;
        System.out.println("Total marks of 5 subject : " +total);
        System.out.println("percentage : " +per);

        if(per >= 90 && per <= 100){
            System.out.println("grade : Distinction ");
        }
        else if(per < 90 && per >= 60){
            System.out.println("grade : First ");
        }
        else if(per < 60  && per >= 40){

            System.out.println("grade : Second ");
        }
        else{
            System.out.println("fail");
        }
    }

}

