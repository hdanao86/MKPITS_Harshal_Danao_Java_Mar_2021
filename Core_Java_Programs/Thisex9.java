//constructor chaining

class customer3
{
    int custno;
    String custname;
    int amount;
    public customer3(int custno){
        this.custno=custno;
    }
    public customer3(int custno,String custname){
        this(custno);
        this.custname=custname;
    }
    public customer3(int custno,String custname,int amount){
        this(custno,custname);
        this.amount=amount;
    }
    void displaydata()
    {
        System.out.println(custno + custname + amount);
    }
}
public class Thisex9 {
    public static void main(String[] args) {
        customer3 c1=new customer3(10,"raj");
        c1.displaydata();
        customer3 c2=new customer3(11,"lala",100);
        c2.displaydata();
    }
}
