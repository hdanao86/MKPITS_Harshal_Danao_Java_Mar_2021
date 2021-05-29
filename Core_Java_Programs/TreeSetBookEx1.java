//Let's see a TreeSet example where we are adding books to set and printing all the books. The elements in TreeSet must be of a Comparable type. String and Wrapper classes are Comparable by default. To add user-defined objects in TreeSet, you need to implement the Comparable interface.
import java.util.*;

class Book4 implements Comparable<Book4>{
    int id;
    String name,author,publisher;
    int qty;
    public Book4(int id,String name,String author,String publisher,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;

    }

    @Override
    public int compareTo(Book4 b) {
        if (id>b.id){
            return  1;
        }else if (id<b.id){
            return -1;
        }else {
            return 0;
        }
    }
}
public class TreeSetBookEx1 {
    public static void main(String[] args) {
        //creating treeset and adding elements
        TreeSet<Book4 > set=new TreeSet<Book4>();
        //creating books
        Book4 b1=new Book4(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book4 b2=new Book4(233,"Operating System","Galvin","Wiley",6);
        Book4 b3=new Book4(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        //adding books to treeset
        set.add(b1);
        set.add(b2);
        set.add(b3);

        //traversing treeset elements
        for (Book4 b : set){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.qty);
        }

    }

}
