//WAP TO ACCEPT GRADE (E OR M ) AND EXP AND  CALCULATE SALARY

import java.util.*;

public class CalculateSalarySwitch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char grade;
        int exp,salary=0;
        System.out.println("enter grade E or M ");
        grade=sc.next().charAt(0);
        System.out.println("enter experience 1 or 2 ");
        exp=sc.nextInt();
        switch(grade)
        {
            case 'e':
                if(exp>=2)
                    salary=2000;
                else
                    salary=1000;
                break;
            case 'm':
                if(exp>=2)
                    salary=4000;
                else
                    salary=3000;
                break;
            default:
                System.out.println("Invalid entry ");
        }
        System.out.println("salary = " + salary);
    }
}
