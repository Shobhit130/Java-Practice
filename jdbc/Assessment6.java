package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Assessment6{
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

try
{
Connection con;
Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
System.out.println("Connection established successfully");
Statement statement = con.createStatement();
String sql = "CREATE TABLE employee(emp_id number, empname varchar2(10), email varchar2(30), city varchar2(10), salary number)";
statement.executeUpdate(sql);
statement.close();
con.close();
}
catch(SQLException e)
{
e.printStackTrace();
}
}
}
