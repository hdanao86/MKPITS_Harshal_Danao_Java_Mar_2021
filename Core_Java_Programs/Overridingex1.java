//creating a parent class
class Vehicle {
    void run() {
        System.out.println("vehicle is running");
    }
}
    //creating a child class
    class Bike extends Vehicle
    {
    public static void main(String[] args) {
        //creating an instance of child class
        Bike obj = new Bike();
        //calling the method with child class instance
        obj.run();
    }

}

