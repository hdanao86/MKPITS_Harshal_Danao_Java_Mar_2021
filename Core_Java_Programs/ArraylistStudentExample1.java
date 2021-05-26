import java.util.*;
import java.util.ArrayList;
public class ArraylistStudentExample1 {
    public static void main(String[] args) {
        ArrayList<String > stud=new ArrayList<String >();
        Scanner sc=new Scanner(System.in);
        //for (int i=1;i<=3;i++)
         {
            System.out.println("enter student details");
            int rno=sc.nextInt();
            String name=sc.next();
            int age=sc.nextInt();
            stud.add(String.valueOf(rno));
            stud.add(name);
            stud.add(String.valueOf(age));
        }
        System.out.println(stud);
    }
}
