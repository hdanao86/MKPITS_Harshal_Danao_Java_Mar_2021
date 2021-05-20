import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Helper extends TimerTask {
    ElevatorEx ex;
    int floor;
    Helper(ElevatorEx ex,int floor){
        this.ex=ex;
        this.floor=floor;
    }
    public static int i = 0;
    public void run()
    {
        if (i < floor){
            ex.bd.setText("closed");
            i=i + 1;
            System.out.println("i= " + i);
            System.out.println("floor= " + floor);
            ex.j1.setText("floor " + i);
        }
        else
        {
            ex.bd.setText("opened");
        }
     //   System.out.println("Timer ran " +  ++i);
    }
}
 /*class Helper1
{
    public static void main(String[] args) {
        Timer timer =new Timer();
        TimerTask task=new Helper();

        timer.schedule(task,2000,1000);
    }
}
*/