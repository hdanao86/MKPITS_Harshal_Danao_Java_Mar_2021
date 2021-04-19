//wap to accept a number and print whether it is a prime no. or not.

import java.util.*;

public class ForLoopPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num,rem=0;
            int cnt=2;
            System.out.println("enter number ");
            num=sc.nextInt();
            for (cnt=2;cnt<=num;cnt++)
            {
                rem=num%cnt;
                if(rem==0)
                {
                    break;
                }
            }
            if (cnt==num)
            {
                System.out.println("Number is prime ");
            }
            else
            {
                System.out.println("Number is not prime ");
            }

    }
}
