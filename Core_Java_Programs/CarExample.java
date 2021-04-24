//create a class car having field color, make , brand and methods getdata(), showdata() and startenginge

import java.util.*;
public class CarExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car c1 = new car();
        System.out.println("enter car color,make year,and barnd");
        String c = sc.next();
        long m = sc.nextLong();
        String b = sc.next();
        c1.getdata(c, m, b);
        c1.showdata();
        c1.startengine();
    }
}
    //creating a class car
    class car
    {
        //member variable
        String color;
        long make;
        String brand;
        //member functions
        void getdata(String c,long m,String b){
            color=c;
            make=m;
            brand=b;
        }
        void showdata()
        {
            System.out.println("car color : " + color);
            System.out.println("car make : " + make);
            System.out.println("car brand : " + brand);
        }
        void startengine()
        {
            System.out.println("Engine is starting ");
        }

    }

