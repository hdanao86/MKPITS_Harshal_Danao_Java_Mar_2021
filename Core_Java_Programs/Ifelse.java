import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        int num=5;
        int rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number" + num);
        rem =  num % 2;
        if(rem==0)
            System.out.println("number is even " );
        else
            System.out.println("number is odd");
    }
}
