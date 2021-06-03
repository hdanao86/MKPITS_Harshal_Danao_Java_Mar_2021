//Java ArrayDeque Example: offerFirst() and pollLast()
import java.util.*;
public class DequeEx2 {
    public static void main(String[] args) {
        Deque<String > deque =new ArrayDeque<String >();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("After offer Traversal :" );
        for (String s : deque){
            System.out.println(s);
        }
       // deque.poll();
       // deque.pollFirst();//it is same as poll()

        deque.pollLast();
        System.out.println("After pollast() Traversal :");
        for (String  s : deque){
            System.out.println(s);
        }
    }
}
