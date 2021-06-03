//Java PriorityQueue Example
import java.util.*;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        //creating priorityqueue and adding elements
        PriorityQueue<String > queue=new PriorityQueue<String >();
        queue.add("amit");
        queue.add("vijay");
        queue.add("karan");
        queue.add("jai");
        queue.add("rahul");

        System.out.println("Head :" +queue.element());

        System.out.println("Head : " +queue.peek());

        System.out.println("Iterating the queue elments :");
        Iterator itr=queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

            queue.remove();
            queue.poll();
            System.out.println("after removing two elements :");
            Iterator<String > itr2=queue.iterator();
            while (itr2.hasNext()){
                System.out.println(itr2.next());
            }
        }
    }

