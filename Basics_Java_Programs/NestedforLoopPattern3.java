// wap to print the pattern as given below
//	1
//	1	2
//	1	2	3

public class NestedforLoopPattern3 {
    public static void main(String[] args){
        int rowcount,coloumncount;
        for (rowcount=1;rowcount<=3;rowcount++)
        {
            for (coloumncount=1;coloumncount<=rowcount;coloumncount++)
            {
                System.out.print(" \t " + coloumncount );
            }
            System.out.println();
        }
    }
}
