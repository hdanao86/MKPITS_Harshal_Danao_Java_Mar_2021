//Java ArrayDeque Example
import java.util.*;

public class ArrayDequeEx1 {
    public static void main(String[] args) {
        //creating deque and adding elements
        Deque<String > deque=new ArrayDeque<String >();
        deque.add("ravi");
        deque.add("vijay");
        deque.add("ajay");
        //Traversing the elements
        for (String  str : deque){
            System.out.println(str);
        }
    }
}
