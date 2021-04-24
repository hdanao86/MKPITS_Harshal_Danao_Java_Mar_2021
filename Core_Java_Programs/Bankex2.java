//creating a parent class
class Bank
{
    int getroi()
    {
        return 0;
    }
}
//creating child classes
class Sbi extends Bank
{
    int getroi()
    {
        return 8;
    }
}
class Icici extends Bank
{
    int getroi()
    {
        return 7;
    }
}
class Axis extends Bank
{
    int getroi()
    {
        return 9;
    }
}
//Bankex2 class to create objects and call the methods
public class Bankex2 {
    public static void main(String[] args) {
        Sbi s=new Sbi();
        Icici i=new Icici();
        Axis a=new Axis();
        System.out.println("sbi rate of interest : " + s.getroi());
        System.out.println("icici rate of interest : " + i.getroi());
        System.out.println("axis rate of interest : " + a.getroi());
    }

}
