//How to Sort List
import java.util.*;
public class ListSortExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        System.out.println("sorting fruits...");
        //add elements
        list.add("mango");
        list.add("apple");
        list.add("grapes");
        list.add("banana");

        //sort the list
        Collections.sort(list);

        //traversing list through the for each loop
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println("sorting numbers...");
        //creating list of numbers
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(43);
        list2.add(65);
        list2.add(67);
        list2.add(12);

        Collections.sort(list2);

        for (Integer num : list2) {
            System.out.println(num);

        }
    }

}