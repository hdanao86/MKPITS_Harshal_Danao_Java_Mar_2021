//create  a parent class person having field name and address  and  create a derived class student
//inherited from person class having additional fields rno and marks. and methods getstudentddata and displaystudent data.

//creating a parent class person
import java.util.*;
class Person1
{
    String name;
    String address;
}
//creating a derived class(child class) student
class student1 extends Person1
{
    int rno;
    int marks;
    public void getstudentdata(int rno,int marks,String name,String address)
    {
        this.rno=rno;
        this.marks=marks;
        this.name=name;
        this.address=address;
    }
    public void displaystudentdata()
    {
        System.out.println(rno + " : " + marks + " : " + name + " : " + address);

    }
}
 public class Inheritex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student details : ");
        int rno=sc.nextInt();
        int marks=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        student1 s=new student1();
        s.getstudentdata(rno,marks,name,address);
        s.displaystudentdata();
    }
}
