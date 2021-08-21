//create a program to view record from company3 table
import java.sql.*;
import java.util.Scanner;

public class JdbcEx7 {
    public static void main(String[] args) {

        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ID");
        int id=sc.nextInt();
       /* System.out.println("enter NAME");
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits", "root", "");
            System.out.println("connected successfully");
            stmt = con.createStatement();
            String str = "select * from company3 where ID=" + id + "";
            ResultSet rs = stmt.executeQuery(str);
            int flag = 0;
            while (rs.next()) {
                flag = 1;
                String nm = rs.getString("ID");
                int ag = rs.getInt("AGE");
                String adress = rs.getString("ADDRESS");
                int salry = rs.getInt("SALARY");

                System.out.println("record found successfully");
            }
            if (flag == 0) {
                System.out.println("Record not found");
            }
            rs.close();
            con.close();



        }catch (Exception ee)
        {
            System.out.println(ee.toString());
        }
    }
}
