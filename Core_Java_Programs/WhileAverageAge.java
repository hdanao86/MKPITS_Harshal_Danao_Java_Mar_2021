//wap to accept age of 5 student calculate and display the average age using while loop.

import java.util.*;

public class WhileAverageAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 1;
        int num = 1;
        int total = 0;
        float avg = 1;
        while (num <= 5) {
            System.out.println("enter Student age " + num);
            age = sc.nextInt();
            total = total + age;
            avg = total / 5.0f;
            num++;
        }
        System.out.println("total age of 5 students = " + total);
        System.out.println("Average Age of 5 students  = " + avg);
    }
}