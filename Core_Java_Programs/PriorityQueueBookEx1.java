//Java PriorityQueue Example: Book
import java.util.*;
class Book5 implements Comparable<Book5>{
    int id;
    String name,author,publisher;
    int qty;
    public Book5(int id,String name,String author,String publisher,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;
    }

    @Override
    public int compareTo(Book5 b) {
        if (id>b.id){
            return 1;
        }else if (id<b.id){
            return -1;
        }else{
            return 0;
        }
    }


}
public class PriorityQueueBookEx1 {
    public static void main(String[] args) {
        Queue<Book5> queue=new PriorityQueue<Book5>();
        //creating books

        Book5 b1=new Book5(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book5 b2=new Book5(233,"Operating System","Galvin","Wiley",6);
        Book5 b3=new Book5(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        //adding boks to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements :");
        //Traversing the elements
        for (Book5 b : queue){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher +  " " + b.qty);
        }

        queue.remove();
        System.out.println("after removing one book record :");
        for (Book5 b : queue){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher +  " " + b.qty);

        }




    }
}
