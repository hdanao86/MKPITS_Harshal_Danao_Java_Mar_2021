//Java LinkedList example to add elements
import java.util.*;
public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<String > ll=new LinkedList<String >();
        System.out.println("intial list of elements  :" + ll);
        //add elements
        ll.add("ravi");
        ll.add("vijay");
        ll.add("arjun");
        ll.add("karan");
        System.out.println("after invoking add(E e) method :" + ll) ;
        //adding an element at specific position
        ll.add(1,"Bheem");
        System.out.println("After invoking add methof : " + ll);

        LinkedList<String > ll2=new LinkedList<String >();
        //adding elemnets
        ll2.add("aman");
        ll2.add("sonu");
        //adding second list elemnts to the first
        ll.addAll(ll2);
        System.out.println("after invoking method : "  +ll);

        LinkedList<String > ll3=new LinkedList<String >();
        //add elements
        ll3.add("john");
        ll3.add("rahul");
        //add third list elements to the first list
        ll.addAll(1,ll3);
        System.out.println("after invoking method : "  + ll);

        //adding an elemnts in the first position
        ll.addFirst("lokesh");
        System.out.println("after invoking method : " + ll);

        //adding an element in the last position
        ll.addLast("samar");
        System.out.println("after invoking method : " + ll);
    }
}
