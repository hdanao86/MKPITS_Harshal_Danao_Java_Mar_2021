// create a class dog having fields breed , height and color and methods getdata and showdata and bark.

import java.util.*;
public class OopsDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dog d1 = new dog();
        System.out.println("enter breed,height, and color");
        String  b = sc.next();
        float h = sc.nextFloat();
        String  c = sc.next();
        d1.getemployeedata(b,h, c);
        d1.showemployeedata();
    }
}
//creating a class car
class dog
{
    //member variable
    String breed;
    float height;
    String color;
    //member functions
    void getemployeedata(String  b,float h,String  c){
        breed=b;
        height=h;
        color=c;
    }
    void showemployeedata()
    {
        System.out.println("breed : " + breed);
        System.out.println("height : " + height);
        System.out.println("color : " + color);
    }
}
