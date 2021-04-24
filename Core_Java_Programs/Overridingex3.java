//creating parent class
class Vehicle2 {
    void run() {
        System.out.println("vehicle is running");
    }
}
    class Bike1 extends Vehicle2 {
        void run() {
            System.out.println("bike is running");
        }
    }
        class Car extends Vehicle2 {
            void run() {
                System.out.println("car is running");
            }
        }
//creating a child class
    public class Overridingex3 {
        public static void main(String[] args) {
            //creating an instance of child class
            Bike1 obj = new Bike1();
            //calling method with child class instance
            obj.run();
            Car obj1 = new Car();
            //calling the method with child class instance
            obj1.run();
        }

    }


