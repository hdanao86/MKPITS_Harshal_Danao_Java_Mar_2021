
class Bike2
{
    Bike2()
    {
        System.out.println("bike constructor called ");
    }
}
class Bike3 extends Bike2
{
    int speed;
    {
        System.out.println("instance intializer block invoked ");
    }
        Bike3()
        {
            //super();
            //System.out.println("instance intializer block invoked");
            //System.out.println("bike3 constructor is invoked");
        }
}
public class InstanceIntializerBlockex2 {
    public static void main(String[] args) {
        Bike3 b=new Bike3();

    }
}
