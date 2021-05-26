//program to sort arraylist elements

import java.util.*;
import java.util.ArrayList;
public class ArrayListSortEx1 {
    public static void main(String[] args) {
        ArrayList<String > stud=new ArrayList<String >();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=5;i++){
            System.out.println("enter student name :");
            String  sn=sc.next();
            stud.add(sn);
        }
        Collections.sort(stud);
        for (String  str : stud){
            System.out.println("student name : " +str);
        }
    }
}
