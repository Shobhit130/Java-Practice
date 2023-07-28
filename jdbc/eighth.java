package jdbc;
import java.util.*;
import java.sql.*;
public class eighth {
	public static void main(String[] args)throws ClassNotFoundException,IllegalAccessException,InstantiationException {
		try {
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
			System.out.println("Connection established successfully");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student where name = 'tom'");
			if(rs.next()==false) {
				System.out.println("No such record found");
			}else {
				do {
					System.out.print(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
					System.out.print(" " + rs.getInt(4));
				}while(rs.next());
			}
			stmt.close();
			con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
