//wap to print the pattern as given below
//	1	3	5
//	1	3	5
//	1	3	5

public class NestedLoopPattern5 {
    public static void main(String[] args){
        int rowcount,coloumncount,num=2;
        for (rowcount=1;rowcount<=3;rowcount++)
        {
            for (coloumncount=1;coloumncount<=5;coloumncount=coloumncount+2)
            {
                System.out.print(" \t " + coloumncount );
            }
            System.out.println();
        }
    }
}
