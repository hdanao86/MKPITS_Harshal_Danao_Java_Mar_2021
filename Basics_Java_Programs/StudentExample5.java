//intilizing using constructor

public class StudentExample5 {
    int id;
    String name;
    //creating constructor
    public StudentExample5(int i,String n)
    {
        id=i;
        name=n;
    }
    public void displayinformation()
    {
        System.out.println("id is " +  id  + " name is " + name);
    }
}
class teststudent3
{
    public static void main(String[] args){
        StudentExample5 s1=new StudentExample5(10 ,"karan");
        //it will call constructor automatically
        s1.displayinformation();

    }
}
