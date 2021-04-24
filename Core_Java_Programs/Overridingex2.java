import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
//creating a parent class
class Vehicle1 {
    //defining a method
    void run() {
        System.out.println("vehicle is running");
    }
}
    //creating a child class
    class Bike2 extends Vehicle1 {
        //defining the same method as in the parent class
        void run() {
            System.out.println("bike is running safely");
        }
    }

public class Overridingex2 {
    public static void main(String[] args) {
        Bike2 obj=new Bike2();//creating object
        obj.run();
    }
}
