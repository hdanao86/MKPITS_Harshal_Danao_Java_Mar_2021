//create a program using initilizing using method-

public class StudentExample4 {
    int id;
    String name;

    public void insertrecord(int i, String n) {
        id = i;
        name = n;
    }

    public void displayinformation() {
        System.out.println("id is " + id +  " : name is " + name);
    }
}
    class teststudent2
    {
        public static void main(String[] args)
        {
            StudentExample4 s1=new StudentExample4();
            StudentExample4 s2=new StudentExample4();
            s1.insertrecord(120," ajay ");
            s2.insertrecord(150," ravi ");
            s1.displayinformation();
            s2.displayinformation();
        }
    }

