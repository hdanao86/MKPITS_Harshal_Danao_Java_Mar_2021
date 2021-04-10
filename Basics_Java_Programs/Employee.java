//wap to accept empno,basic_salary, empname, designation and then display emp details
import java.util.*;
public class Employee {
    public static void main(String[] args) {
        int empno,basic_salary;
        String empname;
        String designation;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter empno : ");
        empno=sc.nextInt();
        System.out.println("enter empname");
        empname=sc.next();
        System.out.println("enter basic_salary");
        basic_salary=sc.nextInt();
        System.out.println("enter designation");
        designation=sc.next();

        System.out.println("emp number : " +empno);
        System.out.println("emp name : " +empname);
        System.out.println("basic salary : " +basic_salary);
        System.out.println("emp designation : " +designation);
}
}
