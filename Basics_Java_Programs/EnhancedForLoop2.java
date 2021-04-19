//accept the integer value from the user using (for each loop)

import java.util.*;
public class EnhancedForLoop2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num[] = new int[3];
        for (int i=0;i<3;i++)
        {
            System.out.println("enter number ");
            num[i]=sc.nextInt();
        }
        for (int n : num)
        {
            System.out.println("num " + n);
        }
    }
}
