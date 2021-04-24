//create a class book having fields bookid,bookname,author,price and methods getbookdata and display bookdata

import java.util.*;

public class OopsBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        book b1 = new book();
        System.out.println("enter bookid,price,bookname,and author");
        int i = sc.nextInt();
        int p = sc.nextInt();
        String  n = sc.next();
        String a = sc.next();
        b1.getemployeedata(i,p, n, a);
        b1.showemployeedata();
    }
}
//creating a class car
class book
{
    //member variable
    int id;
    int price;
    String bookname;
    String author;
    //member functions
    void getemployeedata(int i,int p,String  n,String a){
        id=i;
        price=p;
        bookname=n;
        author=a;
    }
    void showemployeedata()
    {
        System.out.println("id : " + id);
        System.out.println("price : " + price);
        System.out.println("bookname : " + bookname);
        System.out.println("author : " + author);
    }
}
