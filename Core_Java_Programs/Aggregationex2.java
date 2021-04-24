////Consider a situation, Employee object contains many informations such as id, name, emailId etc. It contains one more object named address, which contains its own informations such as city, state, country, zipcode etc. as given below.


 class Address
{
    String city,state,country;
    public Address(String city,String state,String country)
    {
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
 class Emp
{
    int id;
    String name;
    Address address;
    public Emp(int id,String name,Address address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display()
    {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
}
public class Aggregationex2 {
    public static void main(String[] args) {
        Address address1=new Address("nagpur","maharashtra","india");
        Emp e=new Emp(100,"ajay",address1);
        e.display();
    }
}
