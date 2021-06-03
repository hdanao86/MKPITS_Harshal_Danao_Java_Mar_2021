//Java Map Example: comparingByKey() in Descending Order

import java.util.*;

public class MapEx3 {
    public static void main(String[] args) {
        Map<Integer,String > map=new HashMap<Integer,String >();
        map.put(100,"amit");
        map.put(101,"vijay");
        map.put(102,"rahul");
        //returns a set view of the mappings contained in this map
        map.entrySet()
                //returns a sequential stream with this collection as its source
        .stream()
                //sorted according to the provided comparator
        .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))

        //performs an action for-each elements of this stream
        .forEach(System.out::println);
    }
}
