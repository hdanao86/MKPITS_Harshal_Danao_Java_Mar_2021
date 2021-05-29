//Java LinkedList example to remove elements
import java.util.*;

public class LinkedListEx3 {
    public static void main(String[] args) {
        LinkedList<String > ll=new LinkedList<String >();
        //add elements
        ll.add("ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Anuj");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Virat");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Amit");
        System.out.println("intial list of elements : " + ll);

        //removing specific element from arraylist
        ll.remove("Vijay");
        System.out.println("after invoking remove method : " + ll);

        //removing element on the basis of specific position
        ll.remove(0);
        System.out.println("after invoking index method : " + ll);

        LinkedList<String > ll2=new LinkedList<String >();
        //add element
        ll2.add("ram");
        ll2.add("hanuman");
        ll.addAll(ll2);
        System.out.println("updated list : " + ll);

        //removing all the new elements from the arraylist
        ll.removeAll(ll2);
        System.out.println("after invoking removeall() method : " + ll);

        //removing first elemnt from the list
        ll.removeFirst();
        System.out.println("after invoking removefirst () method : "  +ll);

        //removing last element from the list
        ll.removeLast();
        System.out.println("after invoking removelast() method : " + ll);

        //removing firstoccurence of element from the list
        ll.removeFirstOccurrence("Gaurav");
        System.out.println("after invoking removingfirstoccurence() method : " +ll);

        //removinglastoccurence of element from the list
        ll.removeLastOccurrence("Harsh");
        System.out.println("afer invoking removlastoccurence() method : " + ll);

        //removing all the elements in the list
        ll.clear();System.out.println("after invoking clear() method : " + ll);


    }
}
