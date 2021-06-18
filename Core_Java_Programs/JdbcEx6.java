//create a program to delete record into company table(accept the values from the user)
import java.sql.*;
import java.util.Scanner;

public class JdbcEx6 {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ID");
        int id=sc.nextInt();
      /*  System.out.println("enter NAME");
        String  name=sc.next();
        System.out.println("enter AGE");
        int age=sc.nextInt();
        System.out.println("enter ADDRESS");
        String  address=sc.next();
        System.out.println("enter SALARY");
        int salary=sc.nextInt();

       */



        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
            System.out.println("connected successfully");
            stmt=con.createStatement();
            String str="delete from company3 where ID='"+id+"'";
            stmt.executeUpdate(str);
            System.out.println("record deleted successfully");
            con.close();
        }catch (Exception ee)
        {
            System.out.println(ee.toString());
        }
    }
}
