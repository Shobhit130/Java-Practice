package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class second2 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
try
{
	Connection con;
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
	System.out.println("Connection established successfully");
	Statement statement = con.createStatement();
Statement statement1 = con.createStatement();
String sql = "INSERT INTO employee (empname, email, city, salary)VALUES"
 +"('harshit','harshit.kumar@gmail.com', 'chennai', 10000)";
 String sql1 = "INSERT INTO employee (empname, email, city, salary) VALUES"
 +"('Sam ', 'joseph.sam@gmail.com', 'banglore', 20000)";
 String sql2 = "INSERT INTO employee(empname, email, city, salary) VALUES"
 +"('Tom', 'tom.kumar@gmail.com', 'hyderabad', 30000)";
 String sql3 = "INSERT INTO employee (empname, email, city, salary) VALUES"
 +"('Ravi', 'ravi.kumar@gmail.com', 'mumbai', 40000)";
 String sql4 = "INSERT INTO employee (empname, email, city,salary) VALUES"
 +"('Nehal', 'nehal.kumar@gmail.com', 'pune', 50000)";
 String sql5 = "INSERT INTO employee (empname, email, city, salary) VALUES"
 +"('Raj', 'raj.kumar@gmail.com', 'nagpur', 60000)";
 String sql6 = "INSERT INTO employee (empname, email, city, salary) VALUES"
 +"('Muskan', 'muskan@gmail.com', 'goa', 7000)";
 String sql7 = "INSERT INTO employee (empname, email, city, salary) VALUES"
 +"('Suresh', 'suresh.kumar@gmail.com', 'Delhi', 8000)";
 String sql8 = "INSERT INTO employee (empname, email, city, salary) VALUES"
 +"('Mahesh', 'mahesh.kumar@gmail.com', 'indore', 9000)";
 String sql9 = "INSERT INTO employee (empname, email, city, salary) VALUES"
 +"('Ramesh', 'ramesh.kumar@gmail.com', 'bhopal', 10000)";
 statement1.executeUpdate(sql);
 statement1.executeUpdate(sql1);
 statement1.executeUpdate(sql2);
 statement1.executeUpdate(sql3);
 statement1.executeUpdate(sql4);
 statement1.executeUpdate(sql5);
 statement1.executeUpdate(sql6);
 statement1.executeUpdate(sql7);
 statement1.executeUpdate(sql8);
 statement1.executeUpdate(sql9);

 statement1.close();
 con.close();
}
catch(SQLException e)
{
e.printStackTrace();
}
}
}