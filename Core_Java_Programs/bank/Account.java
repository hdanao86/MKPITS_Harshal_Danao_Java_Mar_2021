package bank;

public class Account {

    int bal=1000; //default access modifier
    public String deposit(int amt)
    {
        bal=bal + amt;
        return "amount deposited , bal is " + bal;
    }

}
