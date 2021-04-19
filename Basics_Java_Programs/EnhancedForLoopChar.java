//accept the character  from the user using (for each loop)

import java.util.*;
public class EnhancedForLoopChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch[] = new char[3];
        for (int i=0;i<3;i++)
        {
            System.out.println("enter character ");
            ch[i]=sc.next().charAt(0);
        }
        for (char n : ch)
        {
            System.out.println("character = " + n);
        }
    }
}
