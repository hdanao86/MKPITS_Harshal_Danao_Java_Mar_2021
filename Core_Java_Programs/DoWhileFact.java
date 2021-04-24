//WAP TO ACCEPT A NUMBER AND PRINT FACTORAIL OF A NUMBER USING DO WHILE LOOP

import java.util.*;

public class DoWhileFact {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        int num;
        int fact;
        do{
            System.out.println("enter number ");
            num=sc.nextInt();
            fact=1;
            while (num>0){
                fact=fact*num;
                num--;
            }
            System.out.println("factorial "+ fact);
        }
        while (num>0);

    }
}
