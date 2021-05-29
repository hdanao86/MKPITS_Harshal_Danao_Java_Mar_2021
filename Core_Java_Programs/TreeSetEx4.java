//In this example, we perform various NavigableSet operations.

import java.util.*;

public class TreeSetEx4 {
    public static void main(String[] args) {
        TreeSet<String > set=new TreeSet<String >();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        System.out.println("Intial set : " + set);

        System.out.println("Reverse set : "  + set.descendingSet());

        System.out.println("Head set : " + set.headSet("c",true));

        System.out.println("Subset : " + set.subSet("a",false,"e",true));

        System.out.println("Tail set : "  +set.tailSet("c",false));
    }
}
