//If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.

public class A1 {
    protected void msg(){System.out.println("Hello java");}
}

 class Simple extends A1{
     public void msg(){System.out.println("Hello java");}//C.T.Error
    public static void main(String args[]){
        Simple obj=new Simple();
        obj.msg();
    }
}

//The default modifier is more restrictive than protected. That is why, there is a compile-time error
