public class ThreadJoinEx3 extends Thread{
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        ThreadJoinEx3 t1=new ThreadJoinEx3();
        ThreadJoinEx3 t2=new ThreadJoinEx3();
        System.out.println("Name of t1:" +t1.getName());
        System.out.println("Name of t2:" +t2.getName());
        System.out.println("id of t1:" +t1.getId());
        System.out.println("id of t2:" +t2.getId());
        t1.start();
        t2.start();
        t1.setName("Harshal");
        System.out.println("After changing name of t1:" + t1.getName());
        t2.setName("Harsh");
        System.out.println("After changing name of t2:" + t2.getName());

    }
}
