//constructor chaning example

class Book
{
    String bookname,author;
    int price;
    public Book(String bookname,String author)
    {
        this.bookname=bookname;
        this.author=author;
    }
    //creating a parameterized constructor
    public Book(String bookname,String author,int price)
    {
        this(bookname,author);
        this.price=price;
    }
    public void displaybookinfo()
    {
        System.out.println(bookname + author + price);
    }
}
public class Thisex2 {
    public static void main(String[] args) {
        Book b=new Book("oracle","richard");
        b.displaybookinfo();
        Book b1=new Book("oracle","richard",1200);
        b1.displaybookinfo();
    }
}
