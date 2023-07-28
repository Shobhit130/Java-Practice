package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class second3 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

try
{
	Connection con;
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
    System.out.println("Connection established successfully");
Statement statement = con.createStatement();
ResultSet rs = statement.executeQuery("SELECT emp_id,empname,email,city,salary FROM employee where salary=10000");
 while(rs.next())
 {
 System.out.println(rs.getString(1));
 System.out.println(rs.getString(2));
 System.out.println(rs.getString(3));
 System.out.println(rs.getString(4));
 System.out.println(rs.getInt(5));
 System.out.println();
 }
 statement.close();
 con.close();


}
catch(SQLException e)
{
e.printStackTrace();
}
}
}
