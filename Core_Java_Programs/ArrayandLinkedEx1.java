//Let's see a simple example where we are using ArrayList and LinkedList both.
import java.util.*;

public class ArrayandLinkedEx1 {
    public static void main(String[] args) {
        List<String > al=new ArrayList<String >();//creating arraylist
        al.add("ravi");
        al.add("vijay");
        al.add("ravi");
        al.add("ajay");

        List<String > al2=new ArrayList<String >();
        al2.add("amir");
        al2.add("akash");
        al2.add("monu");
        al2.add("sahil");

        System.out.println("Arraylist :" + al);
        System.out.println("Linkedlist :" + al2);

    }
}
