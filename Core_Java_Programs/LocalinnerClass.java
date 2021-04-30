//A class i.e. created inside a method is called local inner class in java. If you want to invoke the methods of local inner class, you must instantiate this class inside the method.
//Java local inner class example

public class LocalinnerClass {
    private int data=30;
    void display(){
        class Local{
            void msg()
            {
                System.out.println("data = " + data);
            }
        }
        Local l=new Local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalinnerClass obj=new LocalinnerClass();
        obj.display();
    }
}
