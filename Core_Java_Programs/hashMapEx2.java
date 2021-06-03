import java.util.*;

public class hashMapEx2 {
    public static void main(String[] args) {
        HashMap<Integer,String > map=new HashMap<Integer,String >();
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes"); //trying duplicate key
        System.out.println("Iterating hashmap :");
        //Traversing the hashmap
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
