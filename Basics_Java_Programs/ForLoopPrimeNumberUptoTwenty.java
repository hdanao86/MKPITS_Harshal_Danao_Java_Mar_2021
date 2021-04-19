//wap to print prime no between 1 and 20

public class ForLoopPrimeNumberUptoTwenty {
    public static void main(String[] args) {
        int num=1,rem = 0;
        int cnt = 2;
        for (cnt=1;cnt<= 20;cnt++)
        {
            rem =num%cnt;
            if (rem == 0)
            {
                System.out.println(+ num);
                break;
            }
            if (cnt==num)
            {

            }
            else
            {

            }
        }
        System.out.println("prime numbers between 1 to 20 are : " + rem);
    }
    }

