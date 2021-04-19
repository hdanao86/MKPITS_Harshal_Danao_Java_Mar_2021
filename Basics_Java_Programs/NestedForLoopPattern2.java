// wap to print the pattern as given below
//	1	1	1
//	2	2	2
//	3	3	3
//using nested for loop.

public class NestedForLoopPattern2 {
    public static void main(String[] args){
        int rowcount,coloumncount;
        for (rowcount=1;rowcount<=3;rowcount++)
        {
            for (coloumncount=1;coloumncount<=3;coloumncount++)
            {
                System.out.print(" \t " + rowcount );
            }
            System.out.println();
        }
    }
}
