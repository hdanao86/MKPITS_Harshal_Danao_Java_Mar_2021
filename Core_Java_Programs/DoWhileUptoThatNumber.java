//WAP ACCEPT A NUMBER AND PRINT FROM 1 TO THAT NUMBER USING DO WHILE LOOP.



import java.util.*;

public class DoWhileUptoThatNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=1;
        int num;
        System.out.println("enter number ");
        num=sc.nextInt();
        m=num;
        do{
            System.out.println("number is " + m);
            m--;
        }
        while (1<=m);
    }
}
