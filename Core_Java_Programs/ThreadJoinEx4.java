public class ThreadJoinEx4 extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        ThreadJoinEx4 t1=new ThreadJoinEx4();
        ThreadJoinEx4 t2=new ThreadJoinEx4();
        t1.start();
        t2.start();
    }
}