//example of multilevel inheritance
//create a class person , then create a class student derived from person class and then create a class parttimestudent derieved from student class

import java.util.*;

class person4
{
    String name;
    String address;
    void getpersondata(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    void displaypersondata()
    {
        System.out.println("name = " + name + " address = " + address);

    }
}
//creating derived class student
class student4 extends person4
{
    int rno;
    int marks;
    public void getstudentdata(int rno,int marks,String name,String address)
    {
        getpersondata(name,address);//calling base class method with 2 parameters

        this.rno=rno;
        this.marks=marks;
    }
    public void displaystudentdata()
    {
        displaypersondata();
        System.out.println("rno = " + rno + " marks  " + marks);

    }
}
//creating paarttimestudent
//creating a derived class student
class parttimestudent extends student4
{
    int noofhours;
    public void getparttimestudentdata(int rno,int marks,String name,String address,int hours)
    {
        getstudentdata(rno, marks, name, address);
        //calling base class method with 2 parameters
        this.noofhours=hours;
    }
    public void displayparttimestudentdata()
    {
        displaystudentdata();
        System.out.println("no of hours " + noofhours);

    }
}
public class Inheritex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter part time student details : ");
        int rno=sc.nextInt();
        int marks=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        int hours=sc.nextInt();
        parttimestudent s=new parttimestudent();
        //creating child class object
        s.getparttimestudentdata(rno,marks,name,address,hours);
        s.displayparttimestudentdata();

    }
}
