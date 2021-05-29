//Java LinkedList Example: Book
import java.util.*;

class Book{
    int id;
    String naeme,author,publisher;
    int qty;
    public Book(int id,String naeme,String author,String publisher,int qty){
        this.id=id;
        this.naeme=naeme;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;
    }
}

public class LinkedListBookEx5 {
    public static void main(String[] args) {
        //creating list of books
        List<Book> b=new LinkedList<Book>();
        //create books elements
        Book b1=new Book(101,"let us c","Y K","BPB",10);
        Book b2=new Book(102,"Data comm","A D","kal",20);
        Book b3=new Book(103,"Operating system","K O","uah",30);
        //adding books list elements
        b.add(b1);
        b.add(b2);
        b.add(b3);

        //treversing list through fo each loop
        for (Book bs : b){
            System.out.println(bs.id + " " + bs.naeme + " " + bs.author + " " + bs.publisher + " " + bs.qty);
        }

    }
}
