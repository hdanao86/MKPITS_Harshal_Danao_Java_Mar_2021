//In this example, Shape is the abstract class, and its implementation is provided by the Rectangle and Circle classes.

abstract class Shape
{
    abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangel extends Shape
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("drawing circle");
    }
}
//In real scenario, method is called by programmer or user
public class Abstractex3 {
    public static void main(String[] args) {
        Shape s=new Circle();
        s.draw();
        Shape s1=new Rectangel();
        s1.draw();
    }
}
