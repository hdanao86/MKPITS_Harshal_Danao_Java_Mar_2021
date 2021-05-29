//Java LinkedList Example
import java.util.*;
import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        //adding thw elements
        ll.add("Harshal");
        ll.add("raj");
        ll.add("dilip");
        ll.add("raj");

        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

