package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class second5{
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

try
{
	Connection con;
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
    System.out.println("Connection established successfully");
Statement statement = con.createStatement();
String sql = "UPDATE employee set empname='Sam Curran' where emp_id=3";
String sql1 = "UPDATE employee set empname='Tom Curran' where emp_id=4";
String sql2 = "UPDATE employee set empname='Ravi Sahni' where emp_id=5";
String sql3 = "UPDATE employee set empname='Nehal Shah' where emp_id=6";
String sql4 = "UPDATE employee set empname='Raj Shah' where emp_id=7";
String sql5 = "UPDATE employee set empname='Muskan Rastogi' where emp_id=8";
String sql6 = "UPDATE employee set empname='Suresh Raina' where emp_id=9";
String sql7 = "UPDATE employee set empname='Ramesh Das' where emp_id=11";
statement.executeUpdate(sql);
statement.executeUpdate(sql1);
statement.executeUpdate(sql2);
statement.executeUpdate(sql3);
statement.executeUpdate(sql4);
statement.executeUpdate(sql5);
statement.executeUpdate(sql6);
statement.executeUpdate(sql7);
statement.close();
con.close();


}
catch(SQLException e)
{
e.printStackTrace();
}
}
}
