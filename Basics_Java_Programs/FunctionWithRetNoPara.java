//function with returning value and no parameters

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FunctionWithRetNoPara {
    static int calculate()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 subject marks ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int total=m1+m2+m3;
        return total;
    }
    public static void main(String[] args){
        int totalreturned=calculate();
        System.out.println("total marks = " + totalreturned);
    }
}
