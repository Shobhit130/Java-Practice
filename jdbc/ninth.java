package jdbc;
import java.util.*;
import java.sql.*;
public class ninth {
	public static void main(String[] args) throws IllegalAccessException,ClassNotFoundException,InstantiationException{
		try {
			student s = new student();
			s.getStudentDetails();
			s.insertStudentDetails();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
class student{
	String name;
	String country;
	String password;
	int mark;
	public void getStudentDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name");
		name = input.nextLine();
		System.out.println("Enter your password");
		password = input.nextLine();
		System.out.println("Enter your Country");
		country = input.nextLine();
		System.out.println("Enter the mark");
		mark = input.nextInt();
	}
	public void insertStudentDetails() throws IllegalAccessException,ClassNotFoundException,SQLException,InstantiationException{
		getConnection connection = new getConnection();
		Connection con = connection.connect("jdbc:mysql://localhost:3306/vit", "root", "");
		String sql = "insert into student values(?,?,?,?);";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, name);
		stmt.setString(2, password);
		stmt.setString(3, country);
		stmt.setInt(4, mark);
		stmt.executeUpdate();
		System.out.println("Record inserted successfully");
		connection.closeConnection(stmt, con);
	}
}
class getConnection{
	public Connection connect(String url,String username,String password) throws IllegalAccessException,ClassNotFoundException,SQLException,InstantiationException{
		Connection con;
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection established successfully");
		return con;
	}
	public void closeConnection(Statement stmt,Connection con) throws SQLException {
		stmt.close();
		con.close();
	}
}