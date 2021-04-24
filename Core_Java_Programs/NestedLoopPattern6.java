//wap to print the pattern given below
//	1
//	1	3
//	1	3	5

public class NestedLoopPattern6 {
    public static void main(String[] args){
        int rowcount,coloumncount,num=1;
        for (rowcount=1;rowcount<=3;rowcount++)
        {
            num=num+2;
            for (coloumncount=1;coloumncount<num;coloumncount=coloumncount+2)
            {
                System.out.print(" \t " + coloumncount );
            }
            System.out.println();
        }
    }

}
