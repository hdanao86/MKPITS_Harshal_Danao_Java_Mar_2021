//wap to ask whether to continue or not using  do while loop

import java.util.*;
public class DoWhileFactContinue {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        int num;
        int fact;
        char ans='y';
        do{
            System.out.println("enter number ");
            num=sc.nextInt();
            fact=1;
            while (num>0){
             fact=fact*num;
             num--;
            }
            System.out.println("factorial "+ fact);
            System.out.println("do you want to continue press y or n");
            ans=sc.next().charAt(0);


        }
        while (ans=='y');

    }
}
