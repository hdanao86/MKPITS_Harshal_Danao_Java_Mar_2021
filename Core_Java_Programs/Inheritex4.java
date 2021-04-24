//calling getpersondata method from getstudentdata method .

import java.util.*;
//creating a parent class person
class Person3
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
//creating derived class (child class) student
class student3 extends Person3
{
    int rno;
    int marks;
    public void getstudentdata(int rno,int marks,String name,String address)
    {
        getpersondata(name,address);//calling base class(parent class) method with 2 parameter
        this.rno=rno;
        this.marks=marks;
    }
    public void displaystudentdata()
    {
        displaypersondata();
        System.out.println(" rno = " + rno + " marks = " + marks);

    }
}
public class Inheritex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student details : ");
        int rno=sc.nextInt();
        int marks=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        student3 s=new student3();//creating child class object
        s.getstudentdata(rno,marks,name,address);
        s.displaystudentdata();
    }
}
