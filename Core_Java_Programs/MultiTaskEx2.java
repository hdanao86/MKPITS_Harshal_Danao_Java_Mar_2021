public class MultiTaskEx2 implements Runnable{
    public void run(){
        System.out.println("task one");
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new MultiTaskEx2());//passing annonymous object of multitaskEx2 class
        Thread t2=new Thread(new MultiTaskEx2());
        t1.start();
        t2.start();

    }
}
