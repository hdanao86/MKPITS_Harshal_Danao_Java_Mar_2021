////create a class calculate having member variable num1 and num2
////and methods addition, substraction and mutliplication

import java.util.*;
public class OopsCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate Call = new Calculate();
        System.out.println("enter 2 numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("enter add,sub,mul ");
        String op = sc.next();
        switch (op) {
            case "add":
                int result = Call.addition(n1, n2);
                System.out.println("addition " + result);
                break;
            case "sub":
                 result = Call.substraction(n1, n2);
                System.out.println("subtraction " + result);
                break;
            case "mul":
                result = Call.multiplication(n1, n2);
                System.out.println("multiplication " + result);
                break;
            default:
                System.out.println("invalid entry ");
                break;
        }
    }
}
    //creating a class Calculate
    class Calculate
    {
        int num1,num2;
        int addition(int n1,int n2)
        {
            num1=n1;
            num2=n2;
            int res=num1+num2;
            return res;
        }
        int substraction(int n1,int n2)
        {
            num1=n1;
            num2=n2;
            int res=num1-num2;
            return res;
        }
        int multiplication(int n1,int n2)
        {
            num1=n1;
            num2=n2;
            int res=num1*num2;
            return res;
        }

    }

