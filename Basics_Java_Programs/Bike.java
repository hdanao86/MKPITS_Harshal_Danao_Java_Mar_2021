//default constructor

public class Bike {
    String color;
    public  Bike()
    {
        color="red";
        System.out.println("bike is created");
    }
    public static void main(String[] args){
        Bike b1=new Bike();
        System.out.println("bike color is " + b1.color);
    }
}
