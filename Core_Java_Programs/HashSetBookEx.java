//Let's see a HashSet example where we are adding books to set and printing all the books.
import java.util.*;
class Book2{
    int id;
    String name,author,publisher;
    int qty;

    public Book2(int id,String name,String author,String publisher,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;
    }
}
public class HashSetBookEx {
    public static void main(String[] args) {
        HashSet<Book2> set=new HashSet<Book2>();
        //creating books
        Book2 b1=new Book2(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book2 b2=new Book2(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book2 b3=new Book2(103,"Operating System","Galvin","Wiley",6);
        //adding boks to hashset
        set.add(b1);
        set.add(b2);
        set.add(b3);

        //traversing the hashset for each loop
        for (Book2 b : set){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.qty);
        }

    }
}
