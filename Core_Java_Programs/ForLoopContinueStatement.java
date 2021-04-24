//wap to print no. from 1 to 20 except 13 using continue statement.

public class ForLoopContinueStatement {
    public static void main(String[] args){
        int cnt;
        for (cnt=1;cnt<=20;cnt++)
        {
            if (cnt==13)
            {
                continue;
            }
            System.out.println("num" + cnt);
        }
    }
}
