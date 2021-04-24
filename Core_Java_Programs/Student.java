//class having constructor and method with the same name of class
//(overloading constructor)

public class Student {
    int id;
    String name;
    int age;
    //creating constructor with 2 parameters
    public Student(int i,String n){
        id=i;
        name=n;
    }
    //overloading constructor with 3 parameters
    public Student(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    public void displayinformation()
    {
        System.out.println("id is " + id + " :name is " + name + " age is " + age);
    }
    public void Student()
    {
        System.out.println("hello from student method");
    }
}
class teststudent
{
    public static void main(String[] args) {
        Student s1=new Student(12,"akash");//it will call constructor automatically
        s1.displayinformation();
        //call 3 parameter constructor
        Student s2=new Student(13,"ajay",22);//it will call constructor automatically
        s2.displayinformation();
    }
}

