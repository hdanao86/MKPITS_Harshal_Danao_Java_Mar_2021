//Java HashMap Example: Book
import java.util.*;

class Book7{
    int id;
    String name,author,publisher;
    int qty;
    public Book7(int id,String  name,String author,String publisher,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;
    }
}
public class HashmapBookEx1 {
    public static void main(String[] args) {
        //creatingmaps of books
        Map<Integer,Book7> map=new HashMap<Integer,Book7>();
        //creating books
        Book7 b1=new Book7(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book7 b2=new Book7(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book7 b3=new Book7(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        //Traversing map
        for (Map.Entry <Integer,Book7 >entry : map.entrySet()){
            int key=entry.getKey();
            Book7 b=entry.getValue();
            System.out.println(" Details " + key);
            System.out.println(b.id + " " + b.name + " " + b.author + " "  + b.publisher + " " + b.qty);

        }


    }
}
