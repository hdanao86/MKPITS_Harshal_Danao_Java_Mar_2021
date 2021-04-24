//) Is final method inherited?
//
//Ans) Yes, final method is inherited but you cannot override it. For Example:

class Bike8
{
    final void run()
    {
        System.out.println("running...");
    }
}
class Honda1 extends Bike8
{
 void eat()
 {
     System.out.println("eating...");
 }
}
public class Finalkeywordex4 {
    public static void main(String[] args) {
        new Honda1().run();//super() do automatically
       // new Honda1().eat();
    }
}
