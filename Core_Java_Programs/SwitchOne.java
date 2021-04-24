//wap to accept 2 no. and operator and display the result. using switch.
import java.util.*;
public class SwitchOne {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n1,n2,res=0;
        char op;
        System.out.println("enter number 1 ");
        n1=s.nextInt();
        System.out.println("enter number 2 ");
        n2=s.nextInt();
        System.out.println("enter operator");
        op=s.next().charAt(0);
        switch (op)
        {
            case '+':
                res=n1+n2;
                break;
            case '-':
                res=n1-n2;
                break;
            case '*':
                res=n1*n2;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        System.out.println("result = " + res);
    }
}
