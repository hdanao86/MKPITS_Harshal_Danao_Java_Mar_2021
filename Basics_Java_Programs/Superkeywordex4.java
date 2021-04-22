import java.util.Scanner;

//creating a parent class person
class person
{
    String name;
    String address;
    void getdata(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    void displaydata()
    {
        System.out.println("name = " + name + " address = " + address);
    }
}
//creating derived class(child ckass)student
class student extends person
{
    int rno;
    int marks;
    public void getdata(int rno,int marks,String name,String address)
    {
        getdata(name,address);//calling parent class method with 2 parameters
        this.rno=rno;
        this.marks=marks;
    }
    void displaydata()
    {
        super.displaydata();
        System.out.println("rno = " + rno + " marks = " + marks);
    }
}
public class Superkeywordex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student details : ");
        int rno=sc.nextInt();
        int marks=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        student s=new student();//creating child class object
        s.getdata(rno,marks,name,address);
        s.displaydata();
    }
}
