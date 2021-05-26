//Let's see an example where we are storing Student class object in an array list.

import java.util.*;

class student{
    int rollno;
    String name;
    int age;
    student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
public class ArrayListClassStudEx1 {
    public static void main(String[] args) {
        //creating user defined class objects
        student s1=new student(1,"ajay",21);
        student s2=new student(2,"ravi",22);
        student s3=new student(3,"dilip",23);
        //creating array list
        ArrayList<student > al=new ArrayList<student>();
        al.add(s1);//adding student class objects
        al.add(s2);
        al.add(s3);
        //getting iterator
        Iterator itr=al.iterator();
        //Traversing elements of arraylist objects
        while (itr.hasNext()){
            student st=(student)itr.next();
            System.out.println(st.rollno + " " +st.name +" " +st.age);
        }
    }
}
