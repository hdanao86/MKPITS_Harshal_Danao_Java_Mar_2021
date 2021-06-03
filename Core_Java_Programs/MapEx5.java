//Java Map Example: comparingByValue() in Descending Order
import java.util.*;


public class MapEx5 {
    public static void main(String[] args) {
        Map<Integer,String > map=new HashMap<Integer,String >();
        map.put(100,"amit");
        map.put(101,"vijay");
        map.put(102,"rahul");
        //returns a set view of the mappings contained in this map
        map.entrySet()
                //returns a sequential stream with this collection as its source
        .stream()
                //sorted according to the provided comaprator
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(System.out::println);

    }
}
