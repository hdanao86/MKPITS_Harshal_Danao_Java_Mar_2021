//example of (this) to call method

public class Calculate {
    void caltotal(int a,int b,int c){
        int tot=a+b+c;
        System.out.println("total " + tot);
        this.calaverage(tot);
    }
    void calaverage(int t)
    {
        float av=(float) t/3;
        System.out.println("average " + av);
    }
}
 class calex
{
    public static void main(String[] args) {
        Calculate c=new Calculate();
        c.caltotal(1,2,3);
    }
}
