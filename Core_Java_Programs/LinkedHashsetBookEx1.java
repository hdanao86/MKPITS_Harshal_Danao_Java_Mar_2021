//Java LinkedHashSet Example: Book
import java.util.*;

class Book3{
    int id;
    String name,author,publisher;
    int qty;

    public Book3(int id,String name,String author,String publisher,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;


    }
}
public class LinkedHashsetBookEx1 {
    public static void main(String[] args) {
        LinkedHashSet<Book3> set=new LinkedHashSet<Book3>();
        //creating books
        Book3 b1=new Book3(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book3 b2=new Book3(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book3 b3=new Book3(103,"Operating System","Galvin","Wiley",6);

        //adding books to hashtable
        set.add(b1);
        set.add(b2);
        set.add(b3);

        //travesing hashtable
        for (Book3 b : set){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.qty);
        }


    }
}
