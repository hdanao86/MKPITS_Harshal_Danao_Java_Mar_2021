//Let's see a simple example of HashMap to store key and value pair.
import java.util.*;

public class HashMapEx1 {
    public static void main(String[] args) {
        //creating hashmap
        HashMap<Integer,String > map=new HashMap<Integer, String>();
        //put elements
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        System.out.println("Iterating hashmap :");
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+ " " + m.getValue());
        }

    }
}
