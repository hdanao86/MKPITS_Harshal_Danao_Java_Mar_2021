//Java Hashtable Example: Book
import java.util.*;
class Book10{
    int id;
    String name,author,publisher;
    int qty;
    public Book10(int id,String name,String author,String publisher,int qty)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;

    }
}

public class HashTableBookEx {
    public static void main(String[] args) {
        Map<Integer,Book10> map=new Hashtable<Integer,Book10>();
        //creating books
        Book10 b1=new Book10(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book10 b2=new Book10(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book10 b3=new Book10(103,"Operating System","Galvin","Wiley",6);
        //adding books to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        //Traversing map
        for (Map.Entry<Integer,Book10> entry : map.entrySet()){
            int key=entry.getKey();
            Book10 b=entry.getValue();
            System.out.println(key + " Deatils : " );
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.qty);
        }


    }
}
