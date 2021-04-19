//Method Overloading: changing no. of arguments
//In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.

class calculate
{
    static int addition(int n1,int n2)
    {
        return n1+n2;
    }
    static int addition(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}
public class Overloadingex1 {
    public static void main(String[] args) {
        calculate cal=new calculate();
        int res=cal.addition(2,3);
        System.out.println("add of 2 no is " + res);
        res=cal.addition(2,3,4);
        System.out.println("add of 3 no is " + res);
    }
}
