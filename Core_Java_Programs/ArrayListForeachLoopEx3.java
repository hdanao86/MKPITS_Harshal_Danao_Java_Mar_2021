//program on traversing arraylist using foreach loop
import java.util.*;
import java.util.ArrayList;
public class ArrayListForeachLoopEx3 {
    public static void main(String[] args) {
        ArrayList<String > stud=new ArrayList<String >();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter student name");
            String  sn=sc.next();
            stud.add(sn);
        }
        stud.forEach(a->{
            System.out.println(a);
        });
    }

}
