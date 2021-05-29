//Java HashSet from another Collection
import java.util.*;

public class HashSetEx4 {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<String >();
        list.add("ravi");
        list.add("vijay");
        list.add("ajay");

        HashSet<String > set=new HashSet<String >(list);
        set.add("gaurav");
        //trevaers the list
        Iterator<String > itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
