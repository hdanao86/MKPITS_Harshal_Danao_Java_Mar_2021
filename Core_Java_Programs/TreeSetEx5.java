//In this example, we perform various SortedSetSet operations.
import java.util.*;

public class TreeSetEx5 {
    public static void main(String[] args) {
        TreeSet<String > set=new TreeSet<String >();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        System.out.println("Intail set : "  +set);

        System.out.println("Head set : " + set.headSet("c"));

        System.out.println("Subset : " + set.subSet("a","e"));

        System.out.println("Tail set :"  + set.tailSet("c"));


    }
}
