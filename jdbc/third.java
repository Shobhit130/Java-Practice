package jdbc;
import java.sql.*;
import java.util.*;
public class third {

	public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException{
		// TODO Auto-generated method stub
		try {
			Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
			System.out.println("Connection established successfully");
			System.out.println("Enter the student details");
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
			String password = input.nextLine();
			String country = input.nextLine();
			int mark = input.nextInt();
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into student values('"+name+"','"+password+"','"+country+"',"+mark+")");
			System.out.println("Record inserted successfully");
			stmt.close();
			con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
