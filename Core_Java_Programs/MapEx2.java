//Java Map Example: comparingByKey()
import java.util.*;
import java.util.stream.Stream;

public class MapEx2 {
    public static void main(String[] args) {
        Map<Integer,String > map=new HashMap<Integer, String>();
        map.put(100,"amit");
        map.put(101,"vijay");
        map.put(102,"rahul");
        //returns a set view of the mappings contained in this map
        map.entrySet()

        //Returns a sequential Stream with this collection as its source
        .stream()
            //sorted according to the provided comparator
        .sorted(Map.Entry.comparingByKey())
                //performs an action for each element of this stream
        .forEach(System.out::println);
    }
}
