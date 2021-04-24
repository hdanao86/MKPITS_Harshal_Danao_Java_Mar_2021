//example of multiple objects-

public class StudentExample3 {
    int id;
    String name;
}
class teststudent
{
    public static void main(String[] args) {
        StudentExample3 s1 = new StudentExample3();
        s1.id = 200;
        s1.name = "amit";
        StudentExample3 s2=new StudentExample3();
        s2.id = 400;
        s2.name = "akash";
        System.out.println(" id is " + s1.id + " name is " + s1.name);
        System.out.println(" id is " + s2.id + " name is " + s2.name);
    }
    }
