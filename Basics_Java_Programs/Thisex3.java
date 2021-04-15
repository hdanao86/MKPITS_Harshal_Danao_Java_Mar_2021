//create a class customer having field custno and custname and method getdata and showdata

class customer
{
    int custno;
    String custname;
    void getdata(int custno,String custname)
    {
        this.custno=custno;
        this.custname=custname;
    }
    void displaydata()
    {
        System.out.println(custno + custname);
    }
}
public class Thisex3 {
    public static void main(String[] args) {
        customer c=new customer();
        c.getdata(111," akshay ");
        c.displaydata();
    }
}
