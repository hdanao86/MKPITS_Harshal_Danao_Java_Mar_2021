
//Java Runtime Polymorphism Example: Shape
class Shape1
{
    void draw()
    {
        System.out.println("drawing");
    }
}
class Recangle extends Shape1
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape1
{
    void draw()
    {
        System.out.println("drawing circle");
    }
}
public class Runtimepoly {
    public static void main(String[] args) {
        Shape1 s;
        s=new Recangle();
        s.draw();
        s=new Circle();
        s.draw();
    }
}
