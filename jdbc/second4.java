package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class second4 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

try
{
	Connection con;
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
    System.out.println("Connection established successfully");
Statement statement = con.createStatement();
String sql = "DELETE FROM employee where city='chennai'";
statement.executeUpdate(sql);
statement.close();
con.close();
 statement.close();
 con.close();


}
catch(SQLException e)
{
e.printStackTrace();
}
}
}