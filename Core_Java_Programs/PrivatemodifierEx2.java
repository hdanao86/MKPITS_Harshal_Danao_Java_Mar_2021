import samplepackage.Ab;

/*
class A{
    private int a=20;
    private void msg()
    {
        System.out.println("hello " + a);
    }
    public void showmsg()
    {
        a=40;
        msg();
    }
}*/
public class PrivatemodifierEx2 {
    public static void main(String[] args) {
       samplepackage .Ab ex=new samplepackage.Ab();
        //ex.a=40;
        //ex.msg();
        ex.showmsg();
    }
}
