//What is blank or uninitialized final variable?
//
//A final variable that is not initialized at the time of declaration is known as blank final variable.
//
//If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed, it is useful. For example PAN CARD number of an employee
//It can be initialized only in constructor.
//Example of blank final variable

class Bike9
{
    final int speedlimit;// balnk final variable
    Bike9()
    {
        speedlimit=50;
        System.out.println(speedlimit);
    }
}
public class Finalkeywordex5 {
    public static void main(String[] args) {
        new Bike9();
    }
}
