//example of copying values without constructor(using assign the values)

public class Book1 {
    String bookname;
    String author;
    public Book1(String bn,String au)
    {
        bookname=bn;
        author=au;
    }
    public Book1()
    {

    }
    public void display()
    {
        System.out.println("book name is " + bookname);
        System.out.println("author is " + author);
    }
}
 class Booex1
{
    public static void main(String[] args) {
        Book1 b1=new Book1("java","marshal");
        Book1 b2=new Book1();
        b2.bookname=b1.bookname;
        b2.author=b1.author;
        b1.display();
        b2.display();
    }
}

