//Iterating ArrayList using For-each loop

import java.util.*;

public class ArrayListForeachLoopEx1 {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<String >();//creating arraylist
        //adding objects in arraylist
        list.add("Apple");
        list.add("grapes");
        list.add("mango");
        list.add("banana");
        list.add("orange");
        //Traverse the list through for-each loop
        for (String fruit : list)
            System.out.println(fruit);
    }
}
