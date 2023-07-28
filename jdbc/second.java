package jdbc;
import java.sql.*;
public class second {

	public static void main(String[] args) throws IllegalAccessException,ClassNotFoundException,InstantiationException {
		// TODO Auto-generated method stub
		try {
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
			System.out.println("Connection established successfully");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into student values('tom','abc123','UK',34)");
			System.out.println("Record inserted successfully");
			stmt.close();
			con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
