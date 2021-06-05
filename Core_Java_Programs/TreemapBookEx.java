import java.util.Map;
import java.util.TreeMap;

//Java TreeMap Example: Book
class Book9{
    int id;
    String name,author,publisher;
    int quantity;
    public Book9(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}

public class TreemapBookEx {
    public static void main(String[] args) {
        //creating maps of books
        Map<Integer, Book9> map=new TreeMap<Integer, Book9>();
        //creating books
        Book9 b1=new Book9(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book9 b2=new Book9(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book9 b3=new Book9(103,"Operating System","Galvin","Wiley",6);
        //adding books
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        //Traversing map
        for (Map.Entry<Integer,Book9> entry : map.entrySet()){
            int key=entry.getKey();
            Book9 b=entry.getValue();
            System.out.println(key +   " Details : " );
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
