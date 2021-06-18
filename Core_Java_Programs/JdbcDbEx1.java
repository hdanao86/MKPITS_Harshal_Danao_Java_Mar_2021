// create a jdbc program to create table into the database.
import java.sql.*;

public class JdbcDbEx1 {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits1","root","");
            System.out.println("connected succesfully");
            stmt=con.createStatement();
            String str="create table mobile(mobid int primary key, mobname varchar(50))";
            stmt.executeUpdate(str);
            System.out.println("table created successfully");
            con.close();

        }catch (Exception ee)
                //code to connect java with mysql database
        {
            System.out.println(ee.toString());
        }
    }
}
