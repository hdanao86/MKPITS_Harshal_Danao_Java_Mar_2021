//Let's see the example of a Comparable interface that sorts the list elements on the basis of age.
//java programs to demonstrate the use of java comparable
//creating a class which implements comparable interface
import java.util.*;
import java.io.*;

class Student implements Comparable<Student>{
    int rno;
    String  name;
    int age;
    Student(int rno,String name,int age){
        this.rno=rno;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student st){
        if (age==st.age)
            return 0;
        else if (age>st.age)
            return 1;
        else
            return -1;
    }
}
//creating a test class to sort the elements
public class ComaprabelEx1 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"vijay",23));
        al.add(new Student(103,"ajay",24));
        al.add(new Student(105,"jay",25));
        Collections.sort(al);
        for (Student  st : al){
            System.out.println(st.rno+ " " + st.name + " " +st.age);
        }
    }
}
