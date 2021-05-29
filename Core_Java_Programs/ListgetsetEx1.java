//The get() method returns the element at the given index, whereas the set() method changes or replaces the element.

import java.util.*;
public class ListgetsetEx1 {
    public static void main(String[] args) {
        //creating list
        List<String > list=new ArrayList<String >();
        //adding elements in the list
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("grapes");

        //accessing the elements
        System.out.println("returning element : " + list.get(1));
        //changing the element
        list.set(1,"orange");
        //iterating the list elemement using for each loop
        for (String fruit : list){
            System.out.println(fruit);
        }


    }
}
