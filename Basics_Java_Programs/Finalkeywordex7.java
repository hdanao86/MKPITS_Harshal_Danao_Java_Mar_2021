//What is final parameter?
//
//If you declare any parameter as final, you cannot change the value of it.

class Bike10
{
    int cube(final int n) {
     //  n = n + 2;//cant be changed as n is final
        return n * n * n;
    }
}
public class Finalkeywordex7 {
    public static void main(String[] args) {
        Bike10 b=new Bike10();
        b.cube(5);
    }
}
