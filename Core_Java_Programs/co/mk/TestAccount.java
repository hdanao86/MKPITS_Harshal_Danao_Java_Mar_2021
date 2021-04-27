package co.mk;

//import bank.Account1;

public class TestAccount {
    //A Java class to test the encapsulated class Account.
        public static void main(String[] args) {
            //creating instance of Account class
            co.mk.Account1 acc = new co.mk.Account1();
            //setting values through setter methods
            acc.setAcc_no(7560504000L);
            acc.setName("Sonoo Jaiswal");
            acc.setEmail("sonoojaiswal@mk.com");
            acc.setAmount(500000f);
            //getting values through getter methods
            System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
        }

    }
