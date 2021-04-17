//inheritance :
//create  a parent class person having field name and address , create a derived class student
//inherited from person class having additional fields rno and marks.

//creating a parent class person
class Person
{
    String name;
    String address;
}
//creating a derived class(child class) student
class student extends Person
{
    int rno;
    int marks;
}
public class Inheritex1 {
    public static void main(String[] args) {
        student s= new student();
        s.rno=100;
        s.name="amit";
        s.address="nagpur";
        s.marks=500;
        System.out.println(s.rno + " : " + s.name + " : " + s.address + " : " + s.marks);
    }
}
