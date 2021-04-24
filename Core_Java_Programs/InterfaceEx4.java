//Java Interface Example: Drawable

interface Shape2
{
    void draw();
}
class circle implements Shape2
{
    public void draw()
    {
        System.out.println("circle coding");
    }
}
public class InterfaceEx4 {
    public static void main(String[] args) {
        circle c=new circle();
        c.draw();
    }
}
