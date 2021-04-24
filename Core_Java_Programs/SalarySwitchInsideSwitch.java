//WAP TO ACCEPT GRADE (E OR M ) AND EXP AND  CALCULATE SALARY.(switch inside switch)


import java.util.*;

public class SalarySwitchInsideSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;
        int exp, salary = 0;
        System.out.println("enter grade E or M ");
        grade = sc.next().charAt(0);
        System.out.println("enter experience 1 or 2 ");
        exp = sc.nextInt();
        switch (grade) {
            case 'e':
                switch (exp) {
                    case 1:
                        salary = 1000;
                        break;
                    case 2:
                        salary = 2000;
                        break;
                    case 'm':
                        switch (exp) {
                            case 3:
                                salary = 4000;
                                break;
                            case 4:
                                salary = 5000;
                                break;
                        }
                }
                }
                System.out.println("salary " + salary);
        }
    }
