//wap to create a string array of 5 elements to store 5 person name.
import java.util.*;
public class StringArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("enter name");
            name[i] = scan.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(" your name is " + name[i]);
        }
    }
}
