//array of object example

public class Book2 {
    String bookname;
    String author;
    public Book2(String bn,String au)
    {
        bookname=bn;
        author=au;

    }
    //display();
    public void display()
    {
        System.out.println("book name is " + bookname);
        System.out.println("author name is " + author);
    }
}
 class Bookex2{
    public static void main(String[] args) {
        Book2 b1[]=new Book2[3];
        b1[0]=new Book2("oracle","abc");
        b1[1]=new Book2("java","xyz");
        b1[2]=new Book2("visual basic","aaa");
        System.out.println("book 1 details are : ");
        b1[0].display();
        System.out.println("book 2 details are : ");
        b1[1].display();
        System.out.println("book 3 details are : ");
        b1[2].display();
    }
}
