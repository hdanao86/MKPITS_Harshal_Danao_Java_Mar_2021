//calling parameterized constrctor from default constructor using this key word

class Student2
{
    //creating default constructor
    public Student2()
    {
        this(55);
        System.out.println("hello from default constructor");
    }
    //calling parameterized constructor
    public Student2(int r)
    {
        System.out.println("rno =  " + r);
    }
}
public class Thisex1 {
    public static void main(String[] args) {
        Student2 s=new Student2();//this will call default constructor
    }
}
