//Java ArrayDeque Example: Book
import java.util.*;

class Book6{
    int id;
    String name,author,publisher;
    int qty;
    public Book6(int id,String name,String author,String publisher,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;
    }
}
public class ArrayDequeBookEx {
    public static void main(String[] args) {
        Deque<Book6> set=new ArrayDeque<Book6>();
        //creating books
        Book6 b1=new Book6(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book6 b2=new Book6(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book6 b3=new Book6(103,"Operating System","Galvin","Wiley",6);
        //adding books to deque
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //traversing deueue
        for (Book6 b : set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.qty);

        }
    }

}
