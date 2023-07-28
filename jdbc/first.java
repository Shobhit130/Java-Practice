package jdbc;
import java.sql.*;
public class first {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
			System.out.println("Connection established successfully");
			con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
