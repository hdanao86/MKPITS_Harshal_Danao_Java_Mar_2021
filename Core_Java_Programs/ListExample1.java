//Let's see a simple example of List where we are using the ArrayList class as the implementation.
import java.util.*;

public class ListExample1 {
    public static void main(String[] args) {
        List<String > list=new ArrayList<String >();
        //add elements
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("grapes");

        //iterating the list element using for each loop
        for (String  fruit : list){
            System.out.println(fruit);
        }
    }
}
