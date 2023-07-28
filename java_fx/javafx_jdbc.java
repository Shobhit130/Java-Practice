package java_fx;
import java.sql.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.text.*;
import java.util.*;
public class javafx_jdbc extends Application{

	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) throws Exception {
		RegistrationForm obj = new RegistrationForm();
		obj.showForm(primaryStage);
	}

}
class RegistrationForm{
	Label lb1 = new Label("Enter your name");
	TextField tf1 = new TextField();
	Label lb2 = new Label("Enter your password");
	PasswordField pass = new PasswordField();
	Label lb3 = new Label("Select your gender");
	ToggleGroup toggle = new ToggleGroup();
	RadioButton opt1 = new RadioButton("Male");
	RadioButton opt2 = new RadioButton("Female");
	Label lb4 = new Label("Select all your subjects");
	CheckBox copt1 = new CheckBox("English");
	CheckBox copt2 = new CheckBox("Maths");
	CheckBox copt3 = new CheckBox("DBMS");
	Label lb5 = new Label("Select your country");
	ComboBox<String> country = new ComboBox<String>();
	Button bt1 = new Button("Submit");
	Label lb6 = new Label();
	public void showForm(Stage primaryStage) {
		opt1.setToggleGroup(toggle);
		opt2.setToggleGroup(toggle);
		country.getItems().add("India");
		country.getItems().add("US");
		country.getItems().add("UK");
		tf1.setMaxWidth(200);
		pass.setMaxWidth(200);
		VBox root = new VBox();
		root.getChildren().add(lb1);
		root.getChildren().add(tf1);
		root.getChildren().add(lb2);
		root.getChildren().add(pass);
		root.getChildren().add(lb3);
		root.getChildren().addAll(opt1,opt2);
		root.getChildren().add(lb4);
		root.getChildren().addAll(copt1,copt2,copt3);
		root.getChildren().add(lb5);
		root.getChildren().add(country);
		root.getChildren().add(bt1);
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				boolean isValid = validateForm();
				if(isValid) {
					String gender = "";
					if(opt1.isSelected()) {
						gender = "Male";
					}else {
						gender = "Female";
					}
					String subjects = "";
					if(copt1.isSelected()) {
						subjects += copt1.getText() + " ";
					}
					if(copt2.isSelected()) {
						subjects += copt2.getText() + " ";
					}
					if(copt3.isSelected()) {
						subjects += copt3.getText();
					}
					student s = new student(tf1.getText(), pass.getText(), gender, subjects, (String)country.getValue());
					boolean res = false;
					try {
						res = s.insertStudent();
					} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
							| SQLException e) {
						e.printStackTrace();
					}
					if(res) {
						lb6.setText("Record Inserted Successfully!");
						lb6.setTextFill(Color.GREEN);
					}else {
						lb6.setText("Record not inserted in the Database");
						lb6.setTextFill(Color.RED);
					}
				}else {
					lb6.setTextFill(Color.RED);
				}
			}
		});
		root.getChildren().add(lb6);
		root.setAlignment(Pos.CENTER);
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setWidth(700);
		primaryStage.setHeight(700);
		primaryStage.show();
	}
	public boolean validateForm() {
		boolean flag = true;
		if(tf1.getText().isEmpty() && flag == true) {
			lb6.setText("Please enter your name");
			flag = false;
		}
		if(pass.getText().isEmpty() && flag == true) {
			lb6.setText("Please enter your password");
			flag = false;
		}
		if(opt1.isSelected() == false && opt2.isSelected() == false && flag == true) {
			lb6.setText("Please select your gender");
			flag = false;
		}
		if(copt1.isSelected() == false && copt2.isSelected() == false && copt3.isSelected() == false && flag == true) {
			lb6.setText("Please select atleast one subject");
			flag = false;
		}
		if(country.getValue() == null && flag == true) {
			lb6.setText("Please select your country");
			flag = false;
		}
		return flag;
	}
}
class student{
	String name;
	String password;
	String gender;
	String subjects;
	String country;
	public student(String name,String password,String gender,String subjects,String country) {
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.subjects = subjects;
		this.country = country;
	}
	public boolean insertStudent() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		getConnection obj = new getConnection();
		Connection con = obj.connect("jdbc:mysql://localhost:3306/vit", "root","");
		String sql = "insert into student1 values(?,?,?,?,?);";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, name);
		stmt.setString(2, password);
		stmt.setString(3, gender);
		stmt.setString(4, subjects);
		stmt.setString(5, country);
		int result = stmt.executeUpdate();
		obj.closeConnection(stmt, con);
		if(result>0) {
			return true;
		}else {
			return false;
		}
	}
}
class getConnection{
	public Connection connect(String url,String username,String password) throws InstantiationException,SQLException,IllegalAccessException,ClassNotFoundException{
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection established successfully");
		return con;
	}
	public void closeConnection(Statement stmt,Connection con) throws SQLException{
		System.out.println("Connection closed");
		stmt.close();
		con.close();
	}
}