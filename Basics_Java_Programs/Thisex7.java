//to invoke current class constructor

class customer2
{
    int custno;
    String custname;
    int amount;
    public customer2()
    {
        amount=1000;
        System.out.println("amount = " + amount);
    }
    public customer2(int custno,String custname)
    {
        this();
        this.custno=custno;
        this.custname=custname;
    }
    void displaydata()
    {
        System.out.println(custno + custname);
    }
}
public class Thisex7 {
    public static void main(String[] args) {
        customer2 c=new customer2(121," raju ");
        c.displaydata();
    }
}
