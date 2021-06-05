//Java LinkedHashMap Example: Key-Value pair
import java.util.*;

public class LinkedhashmapEx2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String > map=new LinkedHashMap<Integer,String >();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Fetching key
        System.out.println("keys : " +map.keySet());
        //Fetching values
        System.out.println("values : " +map.values());
        //Fetching key value pair
        System.out.println("key value pairs : " +map.entrySet());

    }
}
