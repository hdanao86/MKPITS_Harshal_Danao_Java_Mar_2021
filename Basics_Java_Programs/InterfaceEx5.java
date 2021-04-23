//In this example, the Drawable interface has only one method. Its implementation is provided by Rectangle and Circle classes. In a real scenario, an interface is defined by someone else, but its implementation is provided by different implementation providers. Moreover, it is used by someone else. The implementation part is hidden by the user who uses the interface.

//interface declaration : by first user
interface Drawable
{
    void draw();
}
//implementation by second user
class Rectangle implements Drawable
{
    public void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class circle1 implements Drawable
{
    public void draw()
    {
        System.out.println("drawing circle");
    }
}
//using interface by : third user
public class InterfaceEx5 {
    public static void main(String[] args) {
        Drawable d=new circle1();//In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
    }
}
