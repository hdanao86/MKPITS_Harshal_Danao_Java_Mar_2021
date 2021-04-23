
interface printable {
    int MIN = 5;
    void print();
}
public class InterfaceEx2 implements printable {
    public void print()
    {
        System.out.println("min = " + MIN);
    }

    public static void main(String[] args) {
        printable p=new InterfaceEx2();
        p.print();
    }
}
