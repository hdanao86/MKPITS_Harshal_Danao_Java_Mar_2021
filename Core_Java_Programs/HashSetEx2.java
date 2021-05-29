//In this example, we see that HashSet doesn't allow duplicate elements.

import java.util.*;

public class HashSetEx2 {
    public static void main(String[] args) {
        //creating hashset and adding elements
        HashSet<String > set=new HashSet<String >();
        set.add("ravi");
        set.add("vijay");
        set.add("ravi");
        set.add("ajay");
        //Traversing elements
        Iterator<String >itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
