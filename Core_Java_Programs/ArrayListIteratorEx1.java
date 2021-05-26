//Let's see an example to traverse ArrayList elements using the Iterator interface.

import java.util.*;

public class ArrayListIteratorEx1 {
    public static void main(String[] args) {
        //creating arraylist
        ArrayList<String > list=new ArrayList<String >();
        //adding objects in arraylist
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("mango");
        list.add("grapes");
        //Traverse list through iteratot
        Iterator itr=list.iterator();//getting the iterator
        while (itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());//printing the elements and move to next

        }
    }
}
