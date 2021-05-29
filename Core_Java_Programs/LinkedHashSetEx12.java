import java.util.*;

public class LinkedHashSetEx12 {
    public static void main(String[] args) {
        //creating linkedhashlist and adding elements
        LinkedHashSet<String > set=new LinkedHashSet<String >();
        set.add("ravi");
        set.add("vijay");
        set.add("ravi");
        set.add("ajay");
        Iterator<String > itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
