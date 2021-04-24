//If you make any variable as final, you cannot change the value of final variable(It will be constant).

class Bike4
{
    final int speedlimit=90;//final variable
    void run()
    {
        //speedlimit=400;
    }
}
public class Finalkeywordex1 {
    public static void main(String[] args) {
        Bike4 b=new Bike4();
        b.run();
    }
}
