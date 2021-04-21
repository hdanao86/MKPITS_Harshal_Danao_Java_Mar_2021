
class Bike5
{
    void run()
    {
        System.out.println("running");
    }
}
class splendor extends Bike5
{
    void run()
    {
        System.out.println("running safely wth 60km ");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        Bike5 b=new splendor();
        b.run();
    }
}
