//Java Map Example: Non-Generic (Old Style)
//Non - generic
import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map map=new HashMap();
        //adding elements to map
        map.put(1,"amit");
        map.put(5,"rahul");
        map.put(2,"jai");
        map.put(6,"amit");
        //Traversing map
        Set set=map.entrySet();//converting to set so that we can traverse
        Iterator itr=set.iterator();
        while (itr.hasNext()){
            //converting to map.entry so that we can get key and values seperately
            Map.Entry entry=(Map.Entry)
                    itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
