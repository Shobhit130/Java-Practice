//import java.sql.*;
//import javafx.application.*;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Pos;
//import javafx.stage.*;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//public class Shobhit_20BDS0162 extends Application{
//	public static void main(String[] args) {
//		launch();
//	}
//	public void start(Stage primaryStage) {
//		registrationForm form = new registrationForm();
//		form.showForm(primaryStage);
//	}
//}
//class registrationForm{
//	Label name = new Label("Enter your name");
//	TextField tfname = new TextField();
//	Label regno = new Label("Enter your registration number");
//	TextField tfregno = new TextField();
//	Label sub = new Label("Choose your subjects");
//	CheckBox sub1 = new CheckBox("DSA");
//	CheckBox sub2 = new CheckBox("DBMS");
//	CheckBox sub3 = new CheckBox("Java Programming");
//	CheckBox sub4 = new CheckBox("AOD");
//	Label cou = new Label("Choose your country");
//	ComboBox<String> country = new ComboBox<String>();
//	ToggleGroup group = new ToggleGroup();
//	Label gender = new Label("Select your gender");
//	RadioButton opt1 = new RadioButton("Male");
//	RadioButton opt2 = new RadioButton("Female");
//	Button submit = new Button("Submit");
//	Label check = new Label();
//	public void showForm(Stage primaryStage) {
//		country.getItems().add("India");
//		country.getItems().add("US");
//		country.getItems().add("UK");
//		country.getItems().add("France");
//		opt1.setToggleGroup(group);
//		opt2.setToggleGroup(group);
//		GridPane root = new GridPane();
//		root.add(name, 0, 0);
//		root.add(tfname, 1, 0);
//		root.add(regno, 0, 1);
//		root.add(tfregno, 1, 1);
//		root.add(sub, 0, 2);
//		root.add(sub1, 0, 3);
//		root.add(sub2, 0, 4);
//		root.add(sub3, 0, 5);
//		root.add(sub4, 0, 6);
//		root.add(cou, 0, 7);
//		root.add(country, 0, 8);
//		root.add(gender, 0, 9);
//		root.add(opt1, 0, 10);
//		root.add(opt2, 1, 10);
//		root.add(submit, 0, 11);
//		root.add(check, 0, 12);
//		root.setAlignment(Pos.CENTER);
//		root.setHgap(10);
//		root.setVgap(10);
//		Scene sc = new Scene(root);
//		primaryStage.setScene(sc);
//		primaryStage.setWidth(700);
//		primaryStage.setHeight(700);
//		primaryStage.setTitle("Student Registration Form");
//		primaryStage.show();
//		submit.setOnAction(new EventHandler<ActionEvent>() {
//			public void handle(ActionEvent event) {
//				boolean result = validateForm();
//				String subs = "";
//				String gen = "";
//				if(result) {
//					if(sub1.isSelected()) {
//						subs += sub1.getText() + " ";
//					}
//					if(sub2.isSelected()) {
//						subs += sub2.getText() + " ";
//					}
//					if(sub3.isSelected()) {
//						subs += sub3.getText() + " ";
//					}
//					if(sub4.isSelected()) {
//						subs += sub4.getText() + " ";
//					}
//					if(opt1.isSelected()) {
//						gen = "Male";
//					}else {
//						gen = "Female";
//					}
//					Stage innerStage = new Stage();
//					Label lb1 = new Label("Registration Number: "+tfregno.getText());
//					Label lb2 = new Label("Name: "+tfname.getText());
//					Label lb3 = new Label("Subjects: "+subs);
//					Label lb4 = new Label("Country: "+(String)country.getValue());
//					Label lb5 = new Label("Gender: "+gen);
//					Label check1 = new Label();
//					Button insert = new Button("Insert");
//					Button close = new Button("Close");
//					VBox root1 = new VBox();
//					root1.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,insert,close,check1);
//					Scene sc1 = new Scene(root1);
//					innerStage.setScene(sc1);
//					innerStage.setWidth(500);
//					innerStage.setHeight(500);
//					innerStage.setTitle("Confirm");
//					root1.setAlignment(Pos.CENTER);
//					root1.setSpacing(10);
//					innerStage.show();
//					String subs1 = subs;
//					String gen1 = gen;
//					insert.setOnAction(new EventHandler<ActionEvent>() {
//						public void handle(ActionEvent event) {
//							student obj = new student(tfregno.getText(),tfname.getText(),subs1,(String)country.getValue(),gen1);
//							try {
//								if(obj.insertStudent()) {
//									check1.setText("Record inserted successfully");
//									check1.setTextFill(Color.GREEN);
//								}else {
//									check1.setText("Record insertion failed!");
//									check1.setTextFill(Color.RED);
//								}
//								
//							} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
//								e.printStackTrace();
//							}
//						}
//					});
//					close.setOnAction(new EventHandler<ActionEvent>() {
//						public void handle(ActionEvent event) {
//							innerStage.close();
//						}
//					});
//				}
//			}
//		});
//	}
//	public boolean validateForm() {
//		boolean flag = true;
//		if(tfname.getText().isEmpty() && flag == true) {
//			check.setText("Please enter your name");
//			flag = false;
//		}
//		if(tfregno.getText().isEmpty() && flag == true) {
//			check.setText("Please enter your registration number");
//			flag = false;
//		}
//		if(!(sub1.isSelected() || sub2.isSelected() || sub3.isSelected() || sub4.isSelected()) && flag == true) {
//			check.setText("Please select atleast one subject");
//			flag = false;
//		}
//		if(country.getValue() == null && flag == true) {
//			check.setText("Please select your country");
//			flag = false;
//		}
//		if(!(opt1.isSelected() | opt2.isSelected()) && flag == true) {
//			check.setText("Please select your gender");
//			flag = false;
//		}
//		if(flag == false) {
//			check.setTextFill(Color.RED);
//		}
//		return flag;
//	}
//}
//class student{
//	String name;
//	String regno;
//	String subjects;
//	String country;
//	String gender;
//	public student(String regno,String name,String subjects,String country,String gender) {
//		this.regno = regno;
//		this.name = name;
//		this.subjects = subjects;
//		this.country = country;
//		this.gender = gender;
//	}
//	public boolean insertStudent() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//		getConnection obj = new getConnection("jdbc:mysql://localhost:3306/vit", "root", "");
//		Connection con = obj.connect();
//		String sql = "insert into student values(?,?,?,?,?);";
//		PreparedStatement stmt = con.prepareStatement(sql);
//		stmt.setString(1, regno);
//		stmt.setString(2, name);
//		stmt.setString(3, subjects);
//		stmt.setString(4, country);
//		stmt.setString(5, gender);
//		int result = stmt.executeUpdate();
//		obj.closeConnection(stmt, con);
//		if(result>0) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//}
//class getConnection{
//	String url;
//	String username;
//	String password;
//	public getConnection(String url,String username,String password) {
//		this.url = url;
//		this.username = username;
//		this.password = password;
//	}
//	public Connection connect() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//		Connection con = null;
//		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//		con = DriverManager.getConnection(url,username,password);
//		System.out.println("Connection established successfully");
//		return con;
//	}
//	public void closeConnection(Statement stmt,Connection con) throws SQLException {
//		System.out.println("Connection closed");
//		stmt.close();
//		con.close();
//	}
//}
//
//
//
