//Let's see a simple example of Java LinkedHashSet class. Here you can notice that the elements iterate in insertion order.

import java.util.*;

public class LinkedHashSetEx1 {
    public static void main(String[] args) {
        //creaing hashset and edding elements
        LinkedHashSet<String > set=new LinkedHashSet<String >();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        Iterator<String > itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
