//wap to create a float array of 5 elements and accept the elements from the user.
import java.util.*;
public class FloatArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num[] = new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("enter number");
            num[i] = scan.nextFloat();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("number is " + num[i]);
        }
    }
}