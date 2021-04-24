//wap to accept number of boolean datatype
import java.util.*;
public class BooleanDatatype {
    public static void main(String[] args){
        boolean a = true;
        System.out.println("a =" +a);
        System.out.println("enter value");
        Scanner s=new Scanner(System.in);
        a=s.nextBoolean();
        System.out.println("value = " +a);
    }
}
