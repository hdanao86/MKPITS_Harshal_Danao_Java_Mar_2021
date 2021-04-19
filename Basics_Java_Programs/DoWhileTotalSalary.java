//WAP TO ACCEPT SALARY OF 5 EMPLOYEES AND DISPLAY THE TOTAL SALARY USING DO WHILE LOOP.

import java.util.*;

public class DoWhileTotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary, total = 0, num=1;
        do {
            System.out.println("enter salary of 5 employes ");
            salary = sc.nextInt();
            total = total + salary;
            num++;
        }
        while (num <= 5);
        {
            System.out.println("total salary " + total);
        }

    }
}



