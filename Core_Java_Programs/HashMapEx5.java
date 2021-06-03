//Java HashMap example to replace() elements
import java.util.*;

public class HashMapEx5 {
    public static void main(String[] args) {
        HashMap<Integer,String > map=new HashMap<Integer,String >();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        System.out.println("Intial list of elements :");
        //traversing elements
        for (Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue() );
        }
        System.out.println("updated list of elements : ");
        map.replace(102,"Gaurav");
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("updated list of elements :");
        map.replace(101,"Vijay","Ravi");
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("updated list of elements :" );
        map.replaceAll((k,v)->"Ajay");
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}
