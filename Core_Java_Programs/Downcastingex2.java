
interface Account
{
    void deposit(int amt);
}
class saving implements Account {
    public void deposit(int amt) {
        System.out.println("deposit of saving");
    }
}

    class current implements Account {
        public void deposit(int amt) {
            System.out.println("deposit of current");
        }
    }

        class call {
            void invoke(Account act)//upcasting
            {
                if (act instanceof saving) {
                    saving s = (saving) act;//downcasting
                    s.deposit(200);
                }
                if (act instanceof current) {
                    current c = (current) act;//downcasying
                    c.deposit(200);
                }

            }
        }


public class Downcastingex2 {
    public static void main(String[] args) {
        Account ac=new current();
        call c=new call();
        c.invoke(ac);
    }
}
