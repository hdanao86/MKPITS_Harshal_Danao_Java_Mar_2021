//Let's see an example to traverse the ArrayList elements through other ways

import java.util.*;

public class ArrayListItratorReverseEx1 {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<String >();
        list.add("ravi");
        list.add("akash");
        list.add("ajay");
        list.add("dilip");
        list.add("arjun");
        //Reverse Traversing list through list iterator
        System.out.println("Reverse Traversing list through list iterator");
        //here elements iterates in reverse order
        ListIterator<String > list1=list.listIterator(list.size());
        while (list1.hasPrevious()){
            String str=list1.previous();
            System.out.println(str);
        }
        // Traversing list through for loop
        System.out.println("Traversing list through for loop");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // Traversing list through for each loop() method
        System.out.println("Traversing list through forEach() method");
        //The forEach() method is a new feature in java 8
        list.forEach(a->{//here we are using lambda expression
            System.out.println(a);
        });

        //Traversing list through foreachReamining() method.
        System.out.println("Traversing list threough forEachRemaining() method");
        Iterator<String > itr=list.iterator();
        itr.forEachRemaining(a->{//here we are using lambda expression
            System.out.println(a);

        });

    }
}
