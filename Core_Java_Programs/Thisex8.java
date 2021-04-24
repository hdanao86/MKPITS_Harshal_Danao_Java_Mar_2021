//to invoke current class constructor class bike

class Bike
{
    int price;
    String name;
    int make;
    public Bike()
    {
         make = 2021;
         System.out.println("make = " + make);
    }
    public Bike(int price,String name)
    {
        this();
        this.price=price;
        this.name=name;
    }
    void displaydata()
    {
        System.out.println(price + " : " + name);
    }
}
public class Thisex8 {
    public static void main(String[] args) {
        Bike b=new Bike(4000,"R15");
        b.displaydata();
    }
}
