//create a class car having field curname and carcost and method getdata and showdata
class car
{
    String carname;
    int carcost;
    void getdata(String carname,int carcost)
    {
        this.carname=carname;
        this.carcost=carcost;
    }
    void displaaydata()
    {
        System.out.println(carname + carcost);
    }
}
public class Thisex4 {
    public static void main(String[] args) {
        car c=new car();
        c.getdata(" honda ",1500);
        c.displaaydata();
    }
}
