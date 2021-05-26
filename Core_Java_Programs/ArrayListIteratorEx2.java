//program on Traversing list through Iterator

import java.util.*;

public class ArrayListIteratorEx2 {
    public static void main(String[] args) {
        ArrayList<String > stud=new ArrayList<String >();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter students name");
            String sn=sc.next();
            stud.add(sn);
        }
        Iterator itr=stud.iterator();
        while (itr.hasNext()){
            System.out.println("student name : " + itr.next());
        }
    }
}
