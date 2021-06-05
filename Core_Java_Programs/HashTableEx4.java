//Java Hashtable Example: putIfAbsent()
import java.util.*;

public class HashTableEx4 {
    public static void main(String[] args) {
        Hashtable<Integer,String > map=new Hashtable<Integer,String >();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println("Initial map : " + map);
        //insert as the specified pair is unique
        map.putIfAbsent(104,"Gaurav");
        System.out.println("updated map : " + map);
        //Returns the current value, as the specified pair already exist
        map.putIfAbsent(101,"Vijay");
        System.out.println("updated map : " +map);
    }
}
