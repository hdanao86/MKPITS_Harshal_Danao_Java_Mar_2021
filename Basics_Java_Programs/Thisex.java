//example of calling another constructor using this keyword

class student1
{
    //creating default constructor
    public student1()
    {
        System.out.println("hello from default constructor");
    }
    //creating a parameterized constructor
    public student1(int r)
    {
        this();//calling default constructor
        System.out.println("rno = " + r);
    }
}
public class Thisex {
    public static void main(String[] args) {
        student1 s=new student1(55);

    }
}
