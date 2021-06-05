//Java TreeMap Example: NavigableMap
import java.util.*;

public class TreemapNavigableEx1 {
    public static void main(String[] args) {
        NavigableMap<Integer,String > map=new TreeMap<Integer,String >();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        //Maintains decending order
        System.out.println("descendingmap : " +map.descendingMap());
        //Returns key value pairs whose keys are less than or equal to the specific key
        System.out.println("headmap :" +map.headMap(102,true));
        //returns key value pairs whose keys are greater than or equal to the specific key
        System.out.println("Tailmap " + map.tailMap(102,true));
        //Retirns key value pairs exists in between the specific key
        System.out.println("subMap : " + map.subMap(100,false,102,true));

    }
}
