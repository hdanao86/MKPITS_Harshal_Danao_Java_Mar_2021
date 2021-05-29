//Java HashSet example to remove elements
import java.util.*;
public class HashSetEx3 {
    public static void main(String[] args) {
        //creating hashset and adding elements
        HashSet<String > set=new HashSet<String >();
        set.add("ravi");
        set.add("vijay");
        set.add("arun");
        set.add("sumit");
        System.out.println("An intial list of elements : " + set);
        //removing specific elemen from hashset
        set.remove("ravi");
        System.out.println("after invoking remove() method : " + set);

        //adding 2nd elements list in 1st
        HashSet<String > set1=new HashSet<String >();
        set1.add("ajay");
        set1.add("gaurav");
        set.addAll(set1);
        System.out.println("updated list : " + set);

        //removing all the new elements from hashset
        set.removeAll(set1);
        System.out.println("After invoking removeall() method : " + set);

        //removing elements on the basis of specified condition
        set.removeIf(str->str.contains("vijay"));
        System.out.println("after invoking reoveif() method " + set);

        //removing al the elements in the set
        set.clear();
        System.out.println("after invoking clear() method " + set);
    }
}
