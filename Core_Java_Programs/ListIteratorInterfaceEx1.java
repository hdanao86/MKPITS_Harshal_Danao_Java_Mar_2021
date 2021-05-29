//Example of ListIterator Interface
import java.util.*;

public class ListIteratorInterfaceEx1 {
    public static void main(String[] args) {
        List<String > al=new ArrayList<String >();
        //add elements
        al.add("amit");
        al.add("vijay");
        al.add("kumar");
        al.add("sachin");

        ListIterator<String > itr=al.listIterator();
        System.out.println("Traversing elements in forward direction");
        while (itr.hasNext()){
            System.out.println("index : " +itr.nextIndex() + "value : " + itr.next());
        }
        System.out.println("Travering elements in backward direction");
        while (itr.hasPrevious()){
            System.out.println("index :" + itr.previousIndex() + "value : " + itr.previous());
        }

    }
}
