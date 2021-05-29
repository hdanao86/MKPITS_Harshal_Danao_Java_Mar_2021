//Let's see an example of List where we are adding the Books.
import java.util.*;

class Book1{
    int id;
    String name,author,publisher;
    int qty;
    public Book1(int id,String name,String author,String publisher,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;
    }
}
public class ListBookExample {
    public static void main(String[] args) {
    //creating list books
        List<Book1> list=new ArrayList<Book1>();
        //create books
        Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book1 b2=new Book1(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);
        //adding books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //traverse list
        for (Book1 b : list){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.qty);
        }
    }
}
