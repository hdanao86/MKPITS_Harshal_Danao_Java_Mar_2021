//constructor chaining book class

class Book1
{
    int bookno;
    String bookname;
    int amount;
    public Book1(int bookno){
        this.bookno=bookno;
    }
    public Book1(int bookno,String bookname){
        this(bookno);
        this.bookname=bookname;
    }
    public Book1(int bookno,String bookname,int amount){
        this(bookno,bookname);
        this.amount=amount;
    }
    void displaydata()
    {
        System.out.println(bookno + bookname + amount);
    }
}

public class Thisex10 {
    public static void main(String[] args) {
        Book1 b1=new Book1(10," java ");
        b1.displaydata();
        Book1 b2=new Book1(11," oracle ",1000);
        b2.displaydata();
    }
}

