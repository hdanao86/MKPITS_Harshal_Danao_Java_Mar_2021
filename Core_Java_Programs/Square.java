//wap in java to accept a number and  print the square of that number
import java.util.*;
public class Square {
    public static void main(String[] args) {
        int num,sq;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num=sc.nextInt();
        sq=num*num;
        System.out.println("square of a number is" +sq);
    }
}
