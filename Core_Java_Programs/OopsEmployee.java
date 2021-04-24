//create a class employee having fields empno,empname, designation, salary and method getemployeedata and displayemployeedata

import java.util.*;

public class OopsEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employe e1 = new Employe();
        System.out.println("enter empno,salary,empname,and designation");
        int e = sc.nextInt();
        int s = sc.nextInt();
        String  n = sc.next();
        String d = sc.next();
        e1.getemployeedata(e,s, n, d);
        e1.showemployeedata();
    }
}
//creating a class car
class Employe
{
    //member variable
    int empno;
    int salary;
    String empname;
    String designation;
    //member functions
    void getemployeedata(int e,int s,String  n,String d){
        empno=e;
        salary=s;
        empname=n;
        designation=d;
    }
    void showemployeedata()
    {
        System.out.println("empno : " + empno);
        System.out.println("empname : " + empname);
        System.out.println("designation : " + designation);
        System.out.println("salary : " + salary);
    }
}
