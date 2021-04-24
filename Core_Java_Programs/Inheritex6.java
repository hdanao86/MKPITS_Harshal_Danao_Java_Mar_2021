//example of hierarchical inheritance.
// create a base class person and create a student class derieved from person class
//and create another class employee derieved from person class

import java.util.*;

class person5
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
//creating a derived class student
class student5 extends person5
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
        System.out.println("rno = " + rno + "marks = " + marks);
    }
}
//creating employee class
class employee extends person5
{
    int empno;
    int salary;
    public void getemployeedata(int empno,int salary,String name,String address)
    {
        getpersondata(name,address);//calling base class method with 2 parameters
        this.empno=empno;
        this.salary=salary;
    }
    public void displayemployeedata()
    {
        displaypersondata();
        System.out.println("empno : " + empno);
        System.out.println("salary : " + salary);
    }
}

public class Inheritex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student details : ");
        int rno=sc.nextInt();
        int marks=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        student5 s=new student5();//creating child class object
        s.getstudentdata(rno,marks,name,address);
        s.displaystudentdata();
        System.out.println("enter employee details : ");
        System.out.println("enter empno : ");
        int empno=sc.nextInt();
        System.out.println("enter employee name : ");
        String empname=sc.next();
        System.out.println("enter employee address : ");
       String empaddress=sc.next();
        System.out.println("enter employee salary : ");
        int salary=sc.nextInt();
        employee emp=new employee();//creating child class object
        emp.getemployeedata(empno,salary,name,address);
        emp.displayemployeedata();
    }
}
