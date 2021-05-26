// example of Get and Set ArrayList

import java.util.*;

public class ArrayListGetSetMehdEx1 {
    public static void main(String[] args) {
        ArrayList<String > al=new ArrayList<String >();
        al.add("mango");
        al.add("banana");
        al.add("apple");
        al.add("orange");
        al.add("grapes");
        //accessing the elements
        System.out.println("Returning element : " +al.get(1));//it will return the 2nd element
        //becouse index starts from 0
        //changing the element
        al.set(1,"Pineaple");
        //traversing list
        for (String  fruit : al)
            System.out.println(fruit);

    }
}
