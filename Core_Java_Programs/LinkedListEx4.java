//Java LinkedList Example to reverse a list of elements

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx4 {
    public static void main(String[] args) {
        LinkedList<String > ll=new LinkedList<String >();
        //add elements
        ll.add("ravi");
        ll.add("karan");
        ll.add("arjun");
        //Traversing the list of elements in reverse order
        Iterator itr=ll.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
