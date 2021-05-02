// function with return type and with arguments

import java.util.Scanner;

public class Studntfun {
    static int calculate(int m1,int m2,int m3)
    {
        int total=m1+m2+m3;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 subject marks");
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();
        int totalreturned=calculate(marks1,marks2,marks3);
        System.out.println("total amrks = " + totalreturned);
    }

}
