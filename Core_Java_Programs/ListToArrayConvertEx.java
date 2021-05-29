//How to convert List to Array

import java.util.*;

public class ListToArrayConvertEx {
    public static void main(String[] args) {
        List<String > list=new ArrayList<String >();
        //add elements
        list.add("mango");
        list.add("banana");
        list.add("apple");

        //converting list to array
        String[] array=list.toArray(new String[list.size()]);
        System.out.println("printing array : " +Arrays.toString(array));
        System.out.println("printing list : " + list);
    }
}
