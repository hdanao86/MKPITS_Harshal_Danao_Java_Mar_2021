//wap to accept designation and calculate bonus using switch

import java.util.*;

public class SwitchTwo {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String designation;
        int bonus=0;
        System.out.println("enter designation ");
        designation=s.next();
        switch (designation)
        {
            case "manager":
                bonus=20000;
                break;
            case "clerk":
                bonus=10000;
                break;
            case "peon":
                bonus=5000;
                break;
            default:
                System.out.println("Invalid designation");
                break;
        }
        System.out.println("bonus = " + bonus);
    }
}

