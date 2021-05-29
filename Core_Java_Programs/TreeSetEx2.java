//Let's see an example of traversing elements in descending order.
import java.util.*;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<String > al=new TreeSet<String >();
        al.add("ravi");
        al.add("vijay");
        al.add("ajay");

        System.out.println("Traversing elements through iterator in desending order : " );

        Iterator itr=al.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
