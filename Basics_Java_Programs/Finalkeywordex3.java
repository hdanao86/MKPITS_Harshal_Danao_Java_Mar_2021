//Java final method

class Bike6
{
    final void run()
    {
        System.out.println("running");
    }
}
class Honda extends Bike6
{
    //void run()
    {
        System.out.println("running safely with 100kmph");
    }
}
public class Finalkeywordex3 {
    public static void main(String[] args) {
        Honda h=new Honda();
        h.run();
    }
}
