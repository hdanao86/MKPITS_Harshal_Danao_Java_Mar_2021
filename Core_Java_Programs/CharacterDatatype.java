//wap to accept number of char datatype
import java.util.*;
public class CharacterDatatype {
    public static void main(String[] args){
        char a = 'h';
        System.out.println("a =" +a);
        System.out.println("enter character");
        Scanner s=new Scanner(System.in);
        a=s.next().charAt(0);
        System.out.println("character = " +a);
    }
}
