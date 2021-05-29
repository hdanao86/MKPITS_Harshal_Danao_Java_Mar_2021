//Let's see a simple example of Java TreeSet
import java.util.*;

public class TreeSetEx1 {
    public static void main(String[] args) {
        //creating treeset ann add elements
        TreeSet<String > al=new TreeSet<String >();
        al.add("ravi");
        al.add("vijay");
        al.add("ravi");
        al.add("ajay");

        //traversing the elements
        Iterator<String > itr=al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
       /* for (String str : al)
        {
            System.out.println(str);
        }*/
    }
}
