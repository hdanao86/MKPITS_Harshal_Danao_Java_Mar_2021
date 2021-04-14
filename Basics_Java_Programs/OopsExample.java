//create a class calculate having member variable num1 and num2
//and methods addition, substraction and mutliplication

import java.util.*;
public class OopsExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculate call = new calculate();
        System.out.println("enter 2 numbers ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = call.addition(n1, n2);
        System.out.println("addition " + result);
        result = call.subtraction(n1, n2);
        System.out.println("subtraction " + result);
        result = call.multiplication(n1, n2);
        System.out.println("multiplication " + result);
    }
}
    //crating a class calculate
    class calculate
    {
        int num1,num2;
        int addition(int n1,int n2){
            num1=n1;
            num2=n2;
            int res=num1+num2;
            return  res;
        }
        int subtraction(int n1,int n2) {
            num1 = n1;
            num2 = n2;
            int res = n1 - n2;
            return res;
        }
            int multiplication(int n1,int n2)
            {
                num1 = n1;
                num2 = n2;
                int res = n1 * n2;
                return res;
            }

        }



