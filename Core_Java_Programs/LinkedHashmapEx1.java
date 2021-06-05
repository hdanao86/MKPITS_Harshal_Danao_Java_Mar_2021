//Java LinkedHashMap Example

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapEx1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String > map=new LinkedHashMap<Integer,String >();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
