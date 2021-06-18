//create a program to create table student .
import java.sql.*;

public class JdbcDbEx2 {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits1","root","");
            System.out.println("connected successfully");
            stmt=con.createStatement();
            String str="create table student2(id int primary key,name varchar(50))";
            stmt.executeUpdate(str);
            System.out.println("table successfully created");
            con.close();
        }catch (Exception ee)
        {
            System.out.println(ee.toString());
        }
    }
}
