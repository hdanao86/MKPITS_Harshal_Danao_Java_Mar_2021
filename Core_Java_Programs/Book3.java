// array of object by accepting values from the user(using for loop)

import java.util.Scanner;

public class Book3 {
    String bookname;
    String author;
    public Book3(String bn,String au){
        bookname=bn;
        author=au;
    }
    //display
    public void display()
    {
        System.out.println("book name is " + bookname);
        System.out.println("author name is " + author);
    }
}
 class Bookex3{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         Book3 b[]=new Book3[3];
         String bn;
         String au;
         for(int i=0;i<3;i++){
             System.out.println("enter bookname and author name ");
             bn=sc.next();
             au=sc.next();
             b[i]=new Book3(bn,au);
         }
         //for display the values
         for(int i=0;i<3;i++)
         {
             b[i].display();
         }
     }
}

