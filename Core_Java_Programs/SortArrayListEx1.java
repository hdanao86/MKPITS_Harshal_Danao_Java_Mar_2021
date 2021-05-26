//Example of sorting arraylist

import java.util.*;

public class SortArrayListEx1 {
    public static void main(String[] args) {
        //creating list of fruits
        List<String > list1=new ArrayList<String >();
        list1.add("banana");
        list1.add("grapes");
        list1.add("apple");
        list1.add("orange");
        list1.add("mango");
        //sorting the list
        Collections.sort(list1);
        //Traverse list through for-each loop
        for (String  fruit : list1)
            System.out.println(fruit);

        System.out.println("Sorting number...");
        //creating a list of numbers
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(15);
        list2.add(51);
        list2.add(85);
        list2.add(45);
        list2.add(95);
        //sorting the list
        Collections.sort(list2);
        //Traverseing the list through for each loop
        for (Integer number : list2)
            System.out.println(number);
    }
}
