import java.sql.Connection;
import java.sql.DriverManager;
public class JdbcEx1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits1","root","");
            System.out.println("connected");
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

}

