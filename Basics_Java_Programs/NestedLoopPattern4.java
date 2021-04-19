//wap to print the pattern as given below
//	1	2	3
//	1	2
//	1

public class NestedLoopPattern4 {
    public static void main(String[] args){
        int rowcount,coloumncount;
        for (rowcount=3;rowcount>0;rowcount--)
        {
            for (coloumncount=1;coloumncount<=rowcount;coloumncount++)
            {
                System.out.print(" \t " + coloumncount );
            }
            System.out.println();
        }
    }
}
