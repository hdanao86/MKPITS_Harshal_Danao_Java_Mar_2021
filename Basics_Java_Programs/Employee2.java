//static variable example

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Employee {
    int empno;
    String empname;
    static String company="mkpits";
    public Employee(int e,String en){
        empno=e;
        empname=en;
    }
    public void display()
    {
        System.out.println(empno  +  empname  +  company);
    }
}
 class Staticex{
     public static void main(String[] args) {
         Employee emp1=new Employee(10," amit ");
         Employee emp2=new Employee(11," ajay ");
         emp1.display();
         emp2.display();
         Employee.company="mk placements";
         emp1.display();
         emp2.display();
     }
}
