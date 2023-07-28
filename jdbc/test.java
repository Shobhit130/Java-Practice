package jdbc;
import java.sql.*;
public class test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
			System.out.println("Connection is established successfully");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into student values('tom','test','india',24);");
			System.out.println("Record inserted successfully");
			stmt.close();
			con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
