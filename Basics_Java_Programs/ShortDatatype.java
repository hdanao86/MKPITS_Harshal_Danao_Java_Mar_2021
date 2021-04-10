//wap to accept number of short datatype
import java.util.*;
public class ShortDatatype {
    public static void main(String[] args){
        short c = 6543;
        System.out.println("c ="+c);
        System.out.println("enter number");
        Scanner s=new Scanner(System.in);
        c=s.nextShort();
        System.out.println("number =" +c);
    }
}
