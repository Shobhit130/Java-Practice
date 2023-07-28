package jdbc;
import java.util.*;
import java.sql.*;
public class sixth {
	public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException{
		try {
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("update student set password = 'test' where name = 'shobhit'");
			if(result>0) {
				System.out.println("Record updated successfully");
			}else {
				System.out.println("No such user found");
			}
			stmt.close();
			con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
