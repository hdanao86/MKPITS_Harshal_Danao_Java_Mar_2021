//Java LinkedHashMap Example: Book
import java.util.*;

class Book8{
    int id;
    String name,author,publisher;
    int qty;
    public Book8(int id,String name,String  author,String publisher,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;
    }
}
public class LinkedHashMapBookEx {
    public static void main(String[] args) {
        //creating map of books
        Map<Integer,Book8> map=new LinkedHashMap<Integer,Book8>();
        //creating books
        Book8 b1=new Book8(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book8 b2=new Book8(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book8 b3=new Book8(103,"Operating System","Galvin","Wiley",6);
        //adding books to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        //Traversing map
        for (Map.Entry<Integer,Book8> entry : map.entrySet()){
            int key=entry.getKey();
            Book8 b=entry.getValue();
            System.out.println(key + " Deatils ");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.qty);
        }
    }
}
