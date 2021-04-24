//. create a class student having member variable rno and name
//and member functions getdata and showdata.

import java.util.*;
public class OppsStudentClass {
    //mamber variable
    int rno;
    String name;
    //mamber function
    void getstudentdata(int r,String n)
    {
        rno=r;
        name=n;
    }
    void showstudentdata()
    {
        System.out.println("rno = " + rno);
        System.out.println("name = " + name);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        OppsStudentClass stud=new OppsStudentClass();
        System.out.println("enter roll number and name : ");
        int r=sc.nextInt();
        String n=sc.next();
        stud.getstudentdata(r,n);
        stud.showstudentdata();

    }

}
