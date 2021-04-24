////wap to create an array of 3 element and display the array element using for each loop.

import java.util.*;
public class EnhancedForLoop1 {
    public static void main(String[] args){
        int num[] = new int[3];
        num[0]=20;
        num[1]=30;
        num[2]=40;
        for (int n : num)
        {
            System.out.println("num = " + n);
        }

    }
}
