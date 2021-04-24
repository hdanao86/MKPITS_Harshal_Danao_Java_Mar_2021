//create a program to used student class in different class

public class StudentExample2 {
    int id;
    String name;
}
class teststudent1
{
    public static void main(String[] args){
        StudentExample2 s1=new StudentExample2();
        s1.id=200;
        s1.name="amit";
        System.out.println("id is " + s1.id);
        System.out.println(" name is " + s1.name);
    }
}