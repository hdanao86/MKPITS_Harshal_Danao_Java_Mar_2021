//exmple of copy ing the values of object to another object using constructor
//create a class book having fields booname and author and constructor with 2 parameters and anohter constructor to copy values of one object to another object. and display method.


public class Book {
    String bookname;
    String author;
    public Book(String bn,String au)
    {
        bookname=bn;
        author=au;
    }
    //creating constructor to copying the value to another obect
    public Book (Book bo)
    {
        bookname=bo.bookname;
        author=bo.author;
    }
    public void display()
    {
        System.out.println("book name is " + bookname);
        System.out.println("author is " + author);

    }
}
class Bookex{
    public static void main(String[] args) {
        Book b1=new Book("oracle","richard");
        Book b2=new Book(b1);
        b1.display();
        b2.display();
    }
}

