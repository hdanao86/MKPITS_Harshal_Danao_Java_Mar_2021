class Bike5
{
    final int speedlimit;//final variable
    Bike5()
    {
        speedlimit=20;
    }
    void run()
    {
    //speedlimit=400;
        System.out.println(speedlimit);
    }
}
public class Finalkeywordex2 {
    public static void main(String[] args) {
        Bike5 b=new Bike5();
        b.run();
    }
}
