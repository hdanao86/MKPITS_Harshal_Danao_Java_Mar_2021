//Let's see a simple example of HashSet. Notice, the elements iterate in an unordered collection.
import java.util.*;

public class HashSeEx1 {
    public static void main(String[] args) {
        //creating hashset and adding elements
        HashSet<String > set=new HashSet<String >();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        //traversing elements
        Iterator<String > itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
