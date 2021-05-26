//program on traversing arraylist using for loop

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistForloopEx2 {
    public static void main(String[] args) {
        ArrayList<String > stud=new ArrayList<String >();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter student name");
            String sn=sc.next();
            stud.add(sn);
        }
        for (int i=0;i<stud.size();i++){
            System.out.println("student name :"+stud.get(i));
        }
    }
}
