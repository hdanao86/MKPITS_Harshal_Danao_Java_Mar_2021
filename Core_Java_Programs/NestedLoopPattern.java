//wap to println output like given below using nested for loop.
//* *
//	*	*
//	*	*	*

import java.util.*;
public class NestedLoopPattern {
    public static void main(String[] args) {
        for (int rowcount = 1; rowcount <= 3; rowcount++) {
            for (int coloumncount = 1; coloumncount <= rowcount; coloumncount++) {


                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}