//to refer to current class method

class customer1
{
    int custno;
    String custname;
    void getdata(int custno,String custname)
    {
        this.custno=custno;
        this.custname=custname;
        this.displaydata();
    }
    void displaydata()
    {
        System.out.println(custno + " : " + custname);
    }
}
public class Thisex5 {
    public static void main(String[] args) {
        customer1 c=new customer1();
        c.getdata(151,"ajay");
    }
}
