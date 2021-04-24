//create  a parent class person having field name and address and methods getpersondata and displaypersondata  and  create a derived class student
//inherited from person class having additional fields rno and marks. and methods getstudentddata and displaystudent data.

import java.util.*;
//creating a parent class person

class Person2
{
    String name;
    String address;
    public void getpersondata(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public void displaypersondata()
    {
        System.out.println("name = " + name + " address = " + address);

    }
}
//creating a derived class(child class) student
class student2 extends Person2
{
    int rno;
    int marks;
    public void getstudentdata(int rno,int marks)
    {
        this.rno=rno;
        this.marks=marks;
    }
    public void displaystudentdata()
    {
        System.out.println("rno = " + rno + " marks " + marks);

    }
}
public class Inheritex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student details : ");
        int rno=sc.nextInt();
        int marks=sc.nextInt();
        String name=sc.next();
        String  address=sc.next();
        student2 s=new student2();//creating child class object
        s.getpersondata(name,address);
        s.getstudentdata(rno,marks);
        s.displaypersondata();
        s.displaystudentdata();

    }
}
