// program to insert records in our mobile table created.
import java.sql.*;
import java.util.Scanner;

public class JdbcDbEx3 {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter mobid");
        int mobid=sc.nextInt();
        System.out.println("enter mobname");
        String mobname=sc.next();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits1","root","");
            System.out.println("connected successfully");
            stmt=con.createStatement();
            String str="insert into mobile(mobid,mobname) values("+mobid+",'"+mobname+ "')";
            stmt.executeUpdate(str);
            System.out.println("record inserted successfully");
            con.close();

        }catch (Exception ee)
        {
            System.out.println(ee.toString());
        }
    }
}
