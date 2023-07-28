//import java.util.*;
//import java.sql.*;
//public class Shobhit_20BDS0162 {
//	public static void main(String[] args) throws IllegalAccessException,ClassNotFoundException,InstantiationException{
//		int choice;
//		try {
//			do {
//				Scanner input = new Scanner(System.in);
//				System.out.println("1.Insert into table\n2.Update Model Name\n3.Display details\n4.Average Price\n5.Delete record");
//				System.out.println("6.Exit");
//				System.out.println("Enter your choice");
//				choice = input.nextInt();
//				switch(choice) {
//				case 1:
//						String carId,ModelName,BrandName;
//						int Price;
//						int n;
//						System.out.println("Enter the number of records");
//						n = input.nextInt();
//						car c[] = new car[n];
//						for(int i=0;i<n;i++) {
//							System.out.println("Enter the car ID");
//							carId = input.next();
//							System.out.println("Enter the model name");
//							ModelName = input.next();
//							System.out.println("Enter the brand name");
//							BrandName = input.next();
//							System.out.println("Enter the price");
//							Price = input.nextInt();
//							c[i] = new car(carId,ModelName,BrandName,Price);
//							c[i].insertCarDetails();
//						}
//						break;
//				case 2:
//					updateModelName();
//					break;
//				case 3:
//					display();
//					break;
//				case 4:
//					displayAverage();
//					break;
//				case 5:
//					delete();
//					break;
//				case 6:
//					break;
//				default:
//					System.out.println("Wrong choice");
//					break;
//				}
//			}while(choice!=6);
//		}
//		catch(SQLException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//	public static void updateModelName() throws IllegalAccessException, ClassNotFoundException, InstantiationException, SQLException {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the car ID for which you want to update the model name");
//		String id = input.next();
//		System.out.println("Enter the new model name");
//		String model = input.next();
//		getConnection connection = new getConnection();
//		Connection con = connection.connect("jdbc:mysql://localhost:3306/vit","root","");
//		String sql = "update car set ModelName = ? where CarId = ?;";
//		PreparedStatement stmt = con.prepareStatement(sql);
//		stmt.setString(2, id);
//		stmt.setString(1, model);
//		int result = stmt.executeUpdate();
//		if(result>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("No such car found in database");
//		}
//		connection.closeConnection(stmt, con);
//	}
//	public static void display() throws IllegalAccessException, ClassNotFoundException, InstantiationException, SQLException{
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the new model name for which you want to display the details");
//		String model = input.next();
//		getConnection connection = new getConnection();
//		Connection con = connection.connect("jdbc:mysql://localhost:3306/vit","root","");
//		Statement stmt = con.createStatement();
//		ResultSet rs = stmt.executeQuery("select CarId,BrandName,Price from car where ModelName = '"+model+"';");
//		if(rs.next() == false) {
//			System.out.println("No such record found");
//		}else {
//			do {
//				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
//			}while(rs.next());
//		}
//		connection.closeConnection(stmt, con);
//	}
//	public static void displayAverage() throws IllegalAccessException, ClassNotFoundException, InstantiationException, SQLException{
//		getConnection connection = new getConnection();
//		Connection con = connection.connect("jdbc:mysql://localhost:3306/vit","root","");
//		Statement stmt = con.createStatement();
//		ResultSet rs = stmt.executeQuery("select avg(Price) from car group by BrandName");
//		if(rs.next() == false) {
//			System.out.println("No such record found");
//		}else {
//			do {
//				System.out.println(rs.getDouble(1));
//			}while(rs.next());
//		}
//		connection.closeConnection(stmt, con);
//	}
//	public static void delete() throws IllegalAccessException, ClassNotFoundException, InstantiationException, SQLException{
//		getConnection connection = new getConnection();
//		Connection con = connection.connect("jdbc:mysql://localhost:3306/vit","root","");
//		Statement stmt = con.createStatement();
//		int result = stmt.executeUpdate("delete from car where ModelName like '%SWI%';");
//		if(result>0) {
//			System.out.println("Records deleted successfully");
//		}else {
//			System.out.println("No records deleted");
//		}
//		connection.closeConnection(stmt, con);
//	}
//
//}
//class car{
//	String carId,ModelName,BrandName;
//	int Price;
//	public car(String carId,String ModelName,String BrandName,int Price) {
//		this.carId = carId;
//		this.ModelName = ModelName;
//		this.BrandName = BrandName;
//		this.Price = Price;
//	}
//	public void insertCarDetails() throws IllegalAccessException,ClassNotFoundException,InstantiationException,SQLException{
//		getConnection connection = new getConnection();
//		Connection con = connection.connect("jdbc:mysql://localhost:3306/vit","root","");
//		String sql = "insert into car values(?,?,?,?);";
//		PreparedStatement stmt = con.prepareStatement(sql);
//		stmt.setString(1, carId);
//		stmt.setString(2, ModelName);
//		stmt.setString(3, BrandName);
//		stmt.setInt(4, Price);
//		stmt.executeUpdate();
//		System.out.println("Record inserted successfully");
//		connection.closeConnection(stmt, con);
//	}
//	
//}
//class getConnection{
//	public Connection connect(String url,String username,String password) throws IllegalAccessException,ClassNotFoundException,InstantiationException,SQLException{
//		Connection con;
//		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//		con = DriverManager.getConnection(url,username,password);
//		System.out.println("Connection established successfully");
//		return con;
//	}
//	public void closeConnection(Statement stmt,Connection con) throws SQLException {
//		stmt.close();
//		con.close();
//	}
//}
//
