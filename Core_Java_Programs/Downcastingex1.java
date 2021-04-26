
class person{}
class customer extends person
{
    static void downmethod(person p){
        if (p instanceof customer){
            customer c=(customer)p;
            System.out.println("downcasting  performed");
        }
        else
        {
            System.out.println("downcasting is not possible");
        }
    }

}
public class Downcastingex1 {
    public static void main(String[] args) {
        person p=new customer();
        customer.downmethod(p);
    }
}
